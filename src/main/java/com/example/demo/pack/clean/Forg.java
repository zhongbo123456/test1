package com.example.demo.pack.clean;
/**
 * @Title: 清理
 * @ClassName: com.example.demo.pack.clean.Forg.java
 * @Description: 清理顺序与初始化顺序相反
 * @author: zhongbo
 * @date:  2019-08-16 16:25
 * @version V1.0
 */
public class Forg extends Amphibian{
    private Characteristic p=new Characteristic("Croaks");
    private Description t=new Description("Eats Bugs");
    Forg() {
        System.out.println("Frog()");
    }

    @Override
    protected void dispose() {
        System.out.println("Frog dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Forg fron=new Forg();
        System.out.println("Bye!");
        fron.dispose();
    }
}
