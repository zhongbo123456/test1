package com.example.demo.test;
/**
 * @ClassName: com.example.demo.test.Test14.java
 * @Description: replace()和replaceFisrst()和replaceAll()
 * @author: zhongbo
 * @date:  2019-08-13 17:17
 * @version V1.0
 */
public class Test14 {
    public static void main(String[] args) {
        String s="hello world java world";
       // s=s.replaceFirst("world","andriod");
        //s=s.replace("world","an");
        s=s.replaceAll("world","an");
        System.out.println("s = " + s);
    }
}
