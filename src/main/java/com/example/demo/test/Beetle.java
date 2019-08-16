package com.example.demo.test;
/**
 * @Title: 继承和初始化
 * @ClassName: com.example.demo.test.Beetle.java
 * @Description:
 * @author: zhongbo
 * @date:  2019-08-16 10:33
 * @version V1.0
 */
public class Beetle extends Insect {
    private int k=printInit("Beetle.k initialized");
    public Beetle(){
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
    private static int x2=printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {
        System.out.println("Beetle constructor");
        Beetle b=new Beetle();
    }
}
