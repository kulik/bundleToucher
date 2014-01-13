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
public class ByteProcessor extends JavaWrapperProcessor<Byte> {

    @Override
    public Byte fromBundle(Bundle b, Field f, Object o) {
        return b.getByte(U.getKey(f));
    }

    @Override
    public void toBundle(Bundle b, Field f, Object value) throws IllegalAccessException {
        b.putByte(U.getKey(f), (Byte) value);
    }
}
