package com.example.petshop;

import java.util.Date;

public class Fish extends Pet{

    public Fish(String name) {
        super(name);
    }

    public Fish(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public String speak() {
        return "blub";
    }
}
