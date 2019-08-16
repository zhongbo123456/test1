package com.example.demo.test;

public class Detergent extends Cleanser{
    @Override
    public void scrub(){
        append("detergent.scrub()");
        super.scrub();
    }
    public void foam(){append("foam()");}

    public static void main(String[] args) {
        Detergent detergent=new Detergent();
        detergent.dilute();
        detergent.apply();
        detergent.scrub();
        detergent.foam();
        System.out.println(detergent);
        System.out.println( "Testing base class");
        Cleanser.main(args);
    }

}
