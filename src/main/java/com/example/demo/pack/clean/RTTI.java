package com.example.demo.pack.clean;
/**
 * @Title: 向下转型
 * @ClassName: com.example.demo.pack.clean.RTTI.java
 * @Description:
 * @author: zhongbo
 * @date:  2019-08-17 15:32
 * @version V1.0
 */
public class RTTI {
    public static void main(String[] args) {
        Userful [] x={
                new Userful(),
                new MoreUserful()
        };
        x[0].f();
        x[1].g();
        //x[1].u();
        ((MoreUserful)x[1]).u();
        //((MoreUserful)x[0]).u();//com.example.demo.pack.clean.Userful cannot be cast to com.example.demo.pack.clean.MoreUserful

    }
}
