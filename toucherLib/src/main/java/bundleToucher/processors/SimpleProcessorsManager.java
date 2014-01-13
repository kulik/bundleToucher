package bundleToucher.processors;

import java.util.HashMap;

import bundleToucher.processors.impl.BooleanProcessor;
import bundleToucher.processors.impl.ByteProcessor;
import bundleToucher.processors.impl.DoubleProcessor;
import bundleToucher.processors.impl.FloatProcessor;
import bundleToucher.processors.impl.IntegerProcessor;
import bundleToucher.processors.impl.LongProcessor;
import bundleToucher.processors.impl.ShortProcessor;
import bundleToucher.processors.impl.StringProcessor;

public class SimpleProcessorsManager {

    private static final HashMap<Class<?>, SimpleTypeProcessor> SIMPLE_TYPE_PARSERS = new HashMap<Class<?>, SimpleTypeProcessor>() {{
        put(Integer.class, new IntegerProcessor());
        put(Double.class, new DoubleProcessor());
        put(Float.class, new FloatProcessor());
        put(Boolean.class, new BooleanProcessor());
        put(Long.class, new LongProcessor());
//        put(BigDecimal.class, new BigDecimalParser());
        put(Short.class, new ShortProcessor());
        put(Byte.class, new ByteProcessor());
        put(String.class, new StringProcessor());
//
//        //Primitive Java Types
        put(Byte.TYPE, new ByteProcessor());
        put(Integer.TYPE, new IntegerProcessor());
        put(Long.TYPE, new LongProcessor());
        put(Short.TYPE, new ShortProcessor());
        put(Float.TYPE, new FloatProcessor());
        put(Double.TYPE, new DoubleProcessor());
        put(Boolean.TYPE, new BooleanProcessor());
    }};


    public static SimpleTypeProcessor getProcessor(Class<?> clazz) {
        SimpleTypeProcessor processor = SIMPLE_TYPE_PARSERS.get(clazz);
        if (processor== null) {
            throw new IllegalArgumentException("processor for class:" + clazz.getName() + "not implemented");
        }
        return processor;
    }
}