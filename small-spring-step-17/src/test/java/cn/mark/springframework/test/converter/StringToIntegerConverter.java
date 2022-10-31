package cn.mark.springframework.test.converter;

import cn.mark.springframework.core.convert.convert.Converter;

public class StringToIntegerConverter implements Converter<String, Integer> {

    @Override
    public Integer convert(String source) {
        return Integer.valueOf(source);
    }

}
