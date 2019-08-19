package com.example.demo.pack.inter;

import com.example.demo.music.Note;

public class Percussion extends Instrument {

    @Override
    public void play(Note n) {
        System.out.println("Percussion.play()" + n);
    }

    @Override
    public String what() {
        return "Percussion";
    }

    @Override
    public void adjust() {
    }
}
