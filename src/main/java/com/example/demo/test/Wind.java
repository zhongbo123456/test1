package com.example.demo.test;
/**
 * @Title: 向上转型
 * @ClassName: com.example.demo.test.Wind.java
 * @Description: Wind引用转换Instrument引用
 * @author: zhongbo
 * @date:  2019-08-15 16:26
 * @version V1.0
 */
public class Wind extends Instrument {
    public static void main(String[] args) {
        Wind wind=new Wind();
        Instrument.tune(wind);
    }
}
