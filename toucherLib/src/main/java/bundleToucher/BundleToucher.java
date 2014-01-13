package bundleToucher;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.List;

import bundleToucher.processors.SimpleProcessorsManager;
import bundleToucher.processors.SimpleTypeProcessor;

/**
 * Created by kulik on 12/23/13.
 */
public class BundleToucher {
    private static final String TAG = "BundleToucher";

    private enum Action {
        LOAD, SAVE
    }

    public static void save(Bundle bundle, Object obj) {
        process(bundle, obj, Action.SAVE);
    }

    public static void restore(Bundle bundle, Object obj) {
        process(bundle, obj, Action.LOAD);
    }

    private static void process(Bundle bundle, Object obj, Action a) {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(BundleTouch.class)) {
                field.setAccessible(true);
                switch (a) {
                    case LOAD:
                        loadField(bundle, field, obj);
                        break;
                    case SAVE:
                        saveField(bundle, field, obj);
                        break;
                }
            }
        }
    }

    private static void loadField(Bundle bundle, Field field, Object obj) {
        try {
            Class type = field.getType();
            if (List.class.equals(type)) {
                Log.i(TAG, "processList");
            } else if (type.isAssignableFrom(Parcelable.class)) {
                Log.i(TAG, "processParselable");
            } else if (type.isAssignableFrom(Serializable.class)) {
                Log.i(TAG, "processSerialazible");

            } else {
                SimpleTypeProcessor processor = SimpleProcessorsManager.getProcessor(type);
                Object value = processor.fromBundle(bundle, field, obj);
                field.set(obj, value);
            }
        } catch (IllegalAccessException e) {
            Log.e(TAG, "Some problem", e);
        }
    }

    private static void saveField(Bundle bundle, Field field, Object obj) {
        try {
            Class type = field.getType();
            if (List.class.equals(type)) {
                Log.i(TAG, "processList");
            } else if (type.isAssignableFrom(Parcelable.class)) {
                Log.i(TAG, "processParselable");
            } else if (type.isAssignableFrom(Serializable.class)) {
                Log.i(TAG, "processSerialazible");

            } else {
                Object value = field.get(obj);
                if (value != null) {
                    SimpleTypeProcessor processor = SimpleProcessorsManager.getProcessor(value.getClass());
                    processor.toBundle(bundle, field, value);
                }
            }
        } catch (IllegalAccessException e) {
            Log.e(TAG, "qq", e);
        }
    }

}
