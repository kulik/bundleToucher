package bundleToucher.processors;

/**
 * Created by kulik on 12/23/13.
 */
public abstract class JavaWrapperProcessor<T> implements SimpleTypeProcessor<T> {
    @Override
    public boolean isPrimitiveType() {
        return false;
    }
}
