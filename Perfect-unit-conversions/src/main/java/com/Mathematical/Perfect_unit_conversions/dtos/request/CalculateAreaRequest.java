package com.Mathematical.Perfect_unit_conversions.dtos.request;

public class CalculateAreaRequest {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getFrom() {
        return from;
    }

    public void setFrom(Double from) {
        this.from = from;
    }

    public Double getTo() {
        return to;
    }

    public void setTo(Double to) {
        this.to = to;
    }

    private Long id;
    private Double from;
    private Double to;
}
