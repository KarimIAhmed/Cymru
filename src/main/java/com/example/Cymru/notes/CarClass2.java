package com.example.Cymru.notes;

import org.springframework.stereotype.Component;

@Component
public class CarClass2 implements CarInterface{
    public String print(String word) {
        return word.toUpperCase();
    }
}
