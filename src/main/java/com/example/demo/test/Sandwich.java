package com.example.demo.test;
/**
 * @Title: 构造器调用
 * @ClassName: com.example.demo.test.Sandwich.java
 * @Description: 1.调用基类构造器 2.按声明顺序调用成员的初始化方法 3.调用导出类构造器
 * @author: zhongbo
 * @date:  2019-08-16 15:37
 * @version V1.0
 */
public class Sandwich extends PotableLunce {
    private Bread b=new Bread();
    private Cheese c=new Cheese();
    private Lettuce l=new Lettuce();
    public Sandwich() {
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }
}
