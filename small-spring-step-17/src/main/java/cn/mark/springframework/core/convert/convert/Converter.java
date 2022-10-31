package cn.mark.springframework.core.convert.convert;

public interface Converter<S, T> {

    /**
     * Convert the source object of type {@code S} to target type {@code T}.
     */
    T convert(S source);
}
