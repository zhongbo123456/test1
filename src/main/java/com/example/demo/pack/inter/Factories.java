package com.example.demo.pack.inter;

public class Factories {
    public static void serviceConsumer(ServiceFactory fact){
        Service service = fact.getService();
        service.method1();
        service.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new Implementation1Facotory());
        serviceConsumer(new Implementation2Factory());
    }
}
