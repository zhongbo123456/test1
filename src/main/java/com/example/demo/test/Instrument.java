package com.example.demo.test;

public class Instrument {
    public void play(){
        System.out.println("success");
    }
    static void tune(Instrument i){
        i.play();
    }
}
