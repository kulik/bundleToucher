package bundleToucher;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by kulik on 12/23/13.
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {
        ElementType.FIELD
})
public @interface BundleTouch {
}
