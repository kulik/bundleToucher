package bundleToucher.processors.impl;

import android.os.Bundle;

import java.lang.reflect.Field;

import bundleToucher.U;
import bundleToucher.processors.JavaWrapperProcessor;

/**
 * User: kulik
 * Date: 12/6/12
 * Time: 8:31 PM
 */
public class IntegerProcessor extends JavaWrapperProcessor<Integer> {

    @Override
    public Integer fromBundle(Bundle b, Field f, Object value) {
        return b.getInt(U.getKey(f));
    }

    @Override
    public void toBundle(Bundle b, Field f, Object value) throws IllegalAccessException {
        b.putInt(U.getKey(f), (Integer) value);
    }
}
