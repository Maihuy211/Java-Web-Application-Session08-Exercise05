package com.example.bai5.validator;

import com.example.bai5.annotation.ValidDate;
import com.example.bai5.dto.TourDto;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DateValidator implements ConstraintValidator<ValidDate, TourDto> {

    @Override
    public boolean isValid(TourDto dto, ConstraintValidatorContext context) {

        if (dto == null) return true;

        if (dto.getStartDate() == null || dto.getEndDate() == null)
            return true;

        return dto.getEndDate().isAfter(dto.getStartDate());
    }
}