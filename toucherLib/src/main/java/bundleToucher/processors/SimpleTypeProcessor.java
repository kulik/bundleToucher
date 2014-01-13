package bundleToucher.processors;

import android.os.Bundle;

import java.lang.reflect.Field;

/**
 * User: kulik
 * Date: 12/6/12
 * Time: 8:30 PM
 */
public interface SimpleTypeProcessor<T> {
    T fromBundle(Bundle b, Field f, Object o);

    void toBundle(Bundle b, Field f, Object o) throws IllegalAccessException;

    public boolean isPrimitiveType();
}
