package com.example.demo.shape;

public class Circle extends Shape {
    @Override
    public void draw(){
        System.out.println("Cicle.draw()");
    }
    @Override
    public void erase(){
        System.out.println("Cicle.erase()");
    }
}
