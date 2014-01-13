package bundleToucher.processors.impl;

import android.os.Bundle;

import java.lang.reflect.Field;
import java.math.BigDecimal;

import bundleToucher.processors.SimpleTypeProcessor;

/**
 * User: kulik
 * Date: 1/21/13
 * Time: 2:49 PM
 */
public class BigDecimalProcessor implements SimpleTypeProcessor<BigDecimal> {

    @Override
    public BigDecimal fromBundle(Bundle b, Field f, Object o) {
        throw new IllegalArgumentException();
    }

    @Override
    public void toBundle(Bundle b, Field f, Object o) {
        throw new IllegalArgumentException();
    }

    @Override
    public boolean isPrimitiveType() {
        return false;
    }
}
