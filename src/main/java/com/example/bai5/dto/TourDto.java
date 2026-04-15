package com.example.bai5.dto;

import com.example.bai5.annotation.ValidDate;
import com.example.bai5.annotation.ValidPrice;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

@ValidPrice
@ValidDate
public class TourDto {

    @NotBlank
    @Pattern(regexp = "^(VN|INT)_\\d{5}$",
            message = "Mã tour phải dạng VN_12345 hoặc INT_12345")
    private String tourCode;

    @NotNull
    @Min(value = 1)
    private Long adultPrice;

    @NotNull
    @Min(value = 1)
    private Long childPrice;

    @NotNull
    @FutureOrPresent(message = "Ngày khởi hành phải >= hôm nay")
    private LocalDate startDate;

    @NotNull
    private LocalDate endDate;

    public String getTourCode() {
        return tourCode;
    }

    public void setTourCode(String tourCode) {
        this.tourCode = tourCode;
    }

    public Long getAdultPrice() {
        return adultPrice;
    }

    public void setAdultPrice(Long adultPrice) {
        this.adultPrice = adultPrice;
    }

    public Long getChildPrice() {
        return childPrice;
    }

    public void setChildPrice(Long childPrice) {
        this.childPrice = childPrice;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    // getters, setters
}