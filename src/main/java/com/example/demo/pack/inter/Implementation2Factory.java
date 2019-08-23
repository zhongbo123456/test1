package com.example.demo.pack.inter;

public class Implementation2Factory  implements ServiceFactory{
    @Override
    public Service getService() {
        return new Implementation2();
    }
}
