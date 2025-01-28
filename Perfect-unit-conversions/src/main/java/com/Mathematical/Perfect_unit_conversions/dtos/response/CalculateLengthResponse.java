package com.Mathematical.Perfect_unit_conversions.dtos.response;

import com.Mathematical.Perfect_unit_conversions.models.Symbol;

public class CalculateLengthResponse {


    private String convertFrom;

    public String getConvertTo() {
        return convertTo;
    }

    public void setConvertTo(String convertTo) {
        this.convertTo = convertTo;
    }

    public String getConvertFrom() {
        return convertFrom;
    }

    public void setConvertFrom(String convertFrom) {
        this.convertFrom = convertFrom;
    }

    private String convertTo;

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public Double getEntryValue() {
        return entryValue;
    }

    public void setEntryValue(Double entryValue) {
        this.entryValue = entryValue;
    }

    private double result;
    private double entryValue;
    private double convertedValue;

    public double getConvertedValue() {
        return convertedValue;
    }

    public void setConvertedValue(double convertedValue) {
        this.convertedValue = convertedValue;
    }

}
