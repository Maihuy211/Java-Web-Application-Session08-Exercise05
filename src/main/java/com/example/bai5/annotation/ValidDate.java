package com.example.bai5.annotation;

import com.example.bai5.validator.DateValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = DateValidator.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidDate {
    String message() default "Ngày kết thúc phải sau ngày khởi hành";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}