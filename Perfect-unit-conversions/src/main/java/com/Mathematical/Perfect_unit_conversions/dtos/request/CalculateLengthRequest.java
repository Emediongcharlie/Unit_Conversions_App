package com.Mathematical.Perfect_unit_conversions.dtos.request;

import com.Mathematical.Perfect_unit_conversions.models.Symbol;

public class CalculateLengthRequest {


    private double entryValue;

    public String getConvertFrom() {
        return convertFrom;
    }

    public void setConvertFrom(String convertFrom) {
        this.convertFrom = convertFrom;
    }

    public String getConvertTo() {
        return convertTo;
    }

    public void setConvertTo(String convertTo) {
        this.convertTo = convertTo;
    }

    private String convertFrom;
    private String convertTo;

    public double getEntryValue() {
        return entryValue;
    }

    public void setEntryValue(Double entryValue) {
        this.entryValue = entryValue;
    }



}
