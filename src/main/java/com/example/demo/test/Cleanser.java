package com.example.demo.test;

public class Cleanser {
    private String s="Cleanser";
    public void append(String a){s+=a;}
    public void dilute(){append("dilute()");}
    public void apply(){append("apply()");}
    public void scrub(){append("scrub()");}
    @Override
    public String toString(){return s;}

    public static void main(String[] args) {
        Cleanser cleanser=new Cleanser();
        cleanser.dilute();
        cleanser.dilute();
        cleanser.scrub();
        System.out.println("cleanser = " + cleanser);


    }
}
