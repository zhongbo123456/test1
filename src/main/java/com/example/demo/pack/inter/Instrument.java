package com.example.demo.pack.inter;

import com.example.demo.music.Note;

public abstract class Instrument {
    private int i;
    public abstract void play(Note n);
    public String what(){
        return "Instrument";
    }
    public abstract void adjust();
}
