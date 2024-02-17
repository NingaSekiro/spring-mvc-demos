package org.example.model;


import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class User {
    @NotNull(message = "moban")
    private String name;
    @Min(18)
    private Integer age;
}
