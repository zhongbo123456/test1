package com.example.demo.pack.clean;

public class RoundGlyph extends Glyph {
    private int radius=1;
    @Override
    void draw() {
        System.out.println("RoundGlyph.draw().radius=" + radius);
    }

    RoundGlyph(int r) {
        radius=r;
        System.out.println("RoundGlyph.RoundGlyph().radius=" + radius);
    }
}
