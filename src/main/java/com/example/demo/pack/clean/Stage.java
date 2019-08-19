package com.example.demo.pack.clean;

public class Stage {
    private Actor actor=new HappyActor();
    public void change(){
        actor=new SadActor();
    }
    public void performPlay(){
        actor.act();
    }
}
