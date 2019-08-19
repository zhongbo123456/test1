package com.example.demo.pack.inter;

import com.example.demo.music.Note;
import com.example.demo.pack.clean.Wheat;

public class Brass extends Wind {
    @Override
    public void play(Note n) {
        System.out.println("Brass.paly()" + n);
    }
    @Override
    public void adjust(){
        System.out.println("Brass.adjust()");
    }
}
