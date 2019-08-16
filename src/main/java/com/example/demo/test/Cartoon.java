package com.example.demo.test;
/**
 * @Title: 继承
 * @ClassName: com.example.demo.test.Art.java
 * @Description: java会自动在子类的构造器中插入对父类构造器的调用
 * @author: zhongbo
 * @date:  2019-08-15 14:24
 * @version V1.0
 */
public class Cartoon extends Drawing {
    public Cartoon() {
        System.out.println("Cartoon contructor");
    }

    public static void main(String[] args) {
        Cartoon cartoon=new Cartoon();
    }
}
