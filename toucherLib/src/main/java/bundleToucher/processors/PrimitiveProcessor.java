package bundleToucher.processors;

/**
 * Created by kulik on 12/23/13.
 */
public abstract class PrimitiveProcessor implements SimpleTypeProcessor {
    @Override
    public boolean isPrimitiveType() {
        return true;
    }
}
