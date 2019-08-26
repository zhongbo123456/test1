package com.example.demo.pack.innerClass;


public class parcell {
    class Contents{
        private int i=11;
        public int value(){return i;}
    }
    class Destinatiomn{
        private String label;
        public Destinatiomn(String whereTo) {
           label=whereTo;
        }
        String readLabel(){ return label; }
    }

    public void ship(String dest){
        Contents c=new Contents();
        Destinatiomn d=new Destinatiomn(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        parcell p=new parcell();
        p.ship("Tasmania");
    }

}
