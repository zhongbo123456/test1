package com.example.demo.pack.clean;
/**
 * @Title: 协变返回类型
 * @ClassName: com.example.demo.pack.clean.CovariantReturn.java
 * @Description:
 * @author: zhongbo
 * @date:  2019-08-17 15:10
 * @version V1.0
 */
public class CovariantReturn {
    public static void main(String[] args) {
        Mill m=new Mill();
        Grain g=m.process();
        System.out.println(g);
        m=new WheatMill();
        g=m.process();
        System.out.println(g);
    }
}
