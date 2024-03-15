package org.example.common.converter;

import org.example.model.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
class ConverterFactory {
    private final Map<Class<?>, Converter<?>> converterMap;

    @Autowired
    public ConverterFactory(List<Converter<?>> converters) {
        converterMap = new HashMap<>();
        for (Converter<?> converter : converters) {
            converterMap.put(converter.forClass(), converter);
        }
    }

    public <T> void convert(T source, Data data) {
        Converter<T> converter = (Converter<T>) converterMap.get(source.getClass());
        converter.convert(source, data);
    }
}