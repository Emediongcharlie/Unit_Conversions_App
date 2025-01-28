package com.Mathematical.Perfect_unit_conversions.models;

import jakarta.persistence.*;

@Entity
public class Conversions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ConversionId;

    public Long getConversionId() {
        return ConversionId;
    }

    public void setConversionId(Long conversionId) {
        ConversionId = conversionId;
    }

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


    public double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public double getEntryValue() {
        return entryValue;
    }

    public void setEntryValue(Double entryValue) {
        this.entryValue = entryValue;
    }

    private double result;
    private double entryValue;
}