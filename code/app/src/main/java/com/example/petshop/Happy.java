package com.example.petshop;

import java.util.Date;

public class Happy extends Mood{
    public Happy(){
    }

    public Happy(Date moodDate){
        super(moodDate);
    }

    @Override
    public String whatIsMood() {
        return "Happy";
    }
}
