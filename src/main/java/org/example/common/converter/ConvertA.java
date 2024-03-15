package org.example.common.converter;

import org.example.model.Data;
import org.example.model.ModelA;
import org.springframework.stereotype.Component;

@Component
class ConvertA implements Converter<ModelA> {
    public void convert(ModelA source, Data data) {
        data.setModelA(source);
    }
    public Class forClass(){
        return ModelA.class;
    };
}