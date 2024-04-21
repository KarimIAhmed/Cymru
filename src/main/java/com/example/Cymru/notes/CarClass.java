package com.example.Cymru.notes;

import org.springframework.stereotype.Component;

@Component
public class CarClass implements CarInterface{

    public String print(String word) {
        return "test printing " + word;
    }
}
