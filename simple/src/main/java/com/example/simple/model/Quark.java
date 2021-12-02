package com.example.simple.model;


import org.springframework.stereotype.Component;

@Component
public class Quark {

    private QuarkType type;

    public Quark() {
    }

    public void setType(QuarkType type) {
        this.type = type;
    }

    public QuarkType getType() {
        return type;
    }
}
