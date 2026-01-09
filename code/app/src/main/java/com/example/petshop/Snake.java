package com.example.petshop;

import java.util.Date;

public class Snake extends Pet implements Pettable{

    public Snake(String name) {
        super(name);
    }

    public Snake(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public String speak() {
        return "hisssss";
    }

    @Override
    public void pet() {}
}
