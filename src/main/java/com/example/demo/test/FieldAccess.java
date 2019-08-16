package com.example.demo.test;
/**
 * @Title: 多态
 * @ClassName: com.example.demo.test.FieldAccess.java
 * @Description: Sub对象转型Super引用时，任何域访问操作都有编译器解析，因此不是多态的
 * @author: zhongbo
 * @date:  2019-08-16 11:48
 * @version V1.0
 */
public class FieldAccess {
    public static void main(String[] args) {
        /**向上转型*/
        Super sup = new Sub();
        System.out.println("sup.field="+sup.field+",sup.getField()="+sup.getField());

        Sub sub=new Sub();
        System.out.println("sub.field="+sub.field+",sub.getField()="+sub.getField());


    }
}
