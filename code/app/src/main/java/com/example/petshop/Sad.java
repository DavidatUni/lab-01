package com.example.petshop;

import java.util.Date;

public class Sad extends Mood{
    public Sad(){
    }

    public Sad(Date moodDate){
        super(moodDate);
    }

    @Override
    public String whatIsMood() {
        return "Sad";
    }
}
