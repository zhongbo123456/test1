package com.example.demo.test;

public class StaticSub extends StaticSuper{
    public static String staticGet(){
        return "Derived staticGet";
    }
    @Override
    public String dynamicGet() {
        return "Derived dynamicGet";
    }
}
