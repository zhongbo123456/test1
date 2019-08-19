package com.example.demo.pack.inter;

import com.example.demo.music.Note;
/**
 * @Title: 抽象类
 * @ClassName: com.example.demo.pack.inter.Music4.java
 * @Description:
 * @author: zhongbo
 * @date:  2019-08-17 16:32
 * @version V1.0
 */
public class Music4 {
    static void tune(Instrument i){
        i.play(Note.MIDDLE_c);
    }
    static void tuneAll(Instrument [] e){
        for (Instrument i:e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument [] orchestra={
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
