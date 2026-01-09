package com.example.petshop;

import java.util.Date;

public class Spider extends Pet {

    public Spider(String name) {
        super(name);
    }

    public Spider(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public String speak() {
        return "hiss";
    }
}
