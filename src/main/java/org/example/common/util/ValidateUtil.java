package org.example.common.util;


import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.xml.validation.Validator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ValidateUtil {
//    private static final Validator validator;
//
//    static {
//        validator = Validation.buildDefaultValidatorFactory().getValidator();
//    }
//
//    public static void validate(Object object) {
//        Set<ConstraintViolation<Object>> validate = validator.validate(object);
//        List<String> errors = validate.stream().map(ConstraintViolation::getMessage).collect(Collectors.toList());
//        System.out.println(errors);
//    }
}
