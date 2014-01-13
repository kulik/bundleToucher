package bundleToucher.processors.impl;

import bundleToucher.processors.SimpleTypeProcessor;

/**
 * User: kulik
 * Date: 6/25/13
 * Time: 9:16 PM
 */
public abstract class PrimitiveParser<T> implements SimpleTypeProcessor<T> {

    @Override
    public boolean isPrimitiveType() {
        return true;
    }
}
