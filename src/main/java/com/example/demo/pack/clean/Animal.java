package com.example.demo.pack.clean;

public class Animal extends LivingCreature{
    private Characteristic p=new Characteristic("has heart");
    private Description t=new Description("Animal not Vegetable");
    Animal() {
        System.out.println("Animal()");
    }

    @Override
    protected void dispose() {
        System.out.println("Animal dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
