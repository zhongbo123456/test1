package com.example.demo.pack.inter;

public class Implementation1Facotory implements ServiceFactory {
    @Override
    public Service getService() {
        return new Implementation1();
    }
}
