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
public class DoubleProcessor extends JavaWrapperProcessor<Double> {

    @Override
    public Double fromBundle(Bundle b, Field f, Object o) {
        return b.getDouble(U.getKey(f));
    }

    @Override
    public void toBundle(Bundle b, Field f, Object value) throws IllegalAccessException {
        b.putDouble(U.getKey(f), (Byte) value);
    }
}
