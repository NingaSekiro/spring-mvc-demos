package org.example.common.converter;

import org.example.model.Data;
import org.example.model.ModelB;
import org.springframework.stereotype.Component;

@Component
class ConvertB implements Converter<ModelB> {
    public void convert(ModelB source, Data data) {
        data.setModelB(source);
    }

    public Class<ModelB> forClass(){
        return ModelB.class;
    }
}