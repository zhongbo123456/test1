package com.example.demo.pack.inter;

import com.example.demo.music.Note;

public class Woodwind extends Wind {
    @Override
    public void play(Note n) {
        System.out.println("Woodwind.play()" + n);
    }

    @Override
    public String what() {
        return "Woodwind";
    }
}
