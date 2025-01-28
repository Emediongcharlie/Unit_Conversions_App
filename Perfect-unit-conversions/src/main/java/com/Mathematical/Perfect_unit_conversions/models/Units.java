package com.Mathematical.Perfect_unit_conversions.models;

import jakarta.persistence.*;

@Entity
public class Units {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    private String category;

    @Enumerated(EnumType.STRING)
    public Enum getSymbol() {
        return symbol;
    }

    public void setSymbol(Enum symbol) {
        this.symbol = symbol;
    }

    private Enum symbol;

}
