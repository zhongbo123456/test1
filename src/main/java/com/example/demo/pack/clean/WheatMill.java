package com.example.demo.pack.clean;

public class WheatMill extends Mill {
    @Override
    Wheat process(){
        return new Wheat();
    }
}
