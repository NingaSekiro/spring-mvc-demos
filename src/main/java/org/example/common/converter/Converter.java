package org.example.common.converter;

import org.example.model.Data;

interface Converter<T> {
    void convert(T source, Data data);
     Class<T> forClass();
}