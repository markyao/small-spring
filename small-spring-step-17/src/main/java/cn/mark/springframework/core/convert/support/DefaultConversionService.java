package cn.mark.springframework.core.convert.support;

import cn.mark.springframework.core.convert.convert.ConverterRegistry;

public class DefaultConversionService  extends GenericConversionService{

    public DefaultConversionService() {
        addDefaultConverters(this);
    }
    public static void addDefaultConverters(ConverterRegistry converterRegistry) {
        // 添加各类类型转换工厂
        converterRegistry.addConverterFactory(new StringToNumberConverterFactory());
    }
}
