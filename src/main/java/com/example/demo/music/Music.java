package com.example.demo.music;
/**
 * @Title: 向上转型
 * @ClassName: com.example.demo.music.Music.java
 * @Description:
 * @author: zhongbo
 * @date:  2019-08-16 10:50
 * @version V1.0
 */
public class Music {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_c);
    }

    public static void main(String[] args) {
        Wind flute=new Wind();
        tune(flute);
    }
}
