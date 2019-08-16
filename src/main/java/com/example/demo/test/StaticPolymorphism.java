package com.example.demo.test;
/**
 * @Title: 多态
 * @ClassName: com.example.demo.test.StaticPolymorphism.java
 * @Description: 方法是静态的，行为不具有多态性
 * @author: zhongbo
 * @date:  2019-08-16 13:46
 * @version V1.0
 */
public class StaticPolymorphism {
    public static void main(String[] args) {
        /**
         * 向上转型
         */
        StaticSuper sup=new StaticSub();
        System.out.println(sup.staticGet());
        System.out.println(sup.dynamicGet());
    }
}
