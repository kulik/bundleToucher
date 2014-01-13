package bundleToucher;

import java.lang.reflect.Field;

/**
 * Created by kulik on 12/23/13.
 */
public class U {

    public static String getKey(Field f){
        return f.getDeclaringClass().getName() + "." + f.getName();
    }
}
