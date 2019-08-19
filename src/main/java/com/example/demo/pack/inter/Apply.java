package com.example.demo.pack.inter;

public class Apply {
    public static void process(Processor p,Object s){
        System.out.println("Using Processing" +"  "+ p.name());
        System.out.println(p.process(s));
    }
    public static String s="Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(),s);
        process(new Downcase(),s);
        process(new Splitter(),s);
    }


}