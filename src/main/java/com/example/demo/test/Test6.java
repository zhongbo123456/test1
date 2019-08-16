package com.example.demo.test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Title: instanceof
 * @ClassName: com.example.demo.test.Test6.java
 * @Description: instanceof用法
 * @author: zhongbo
 * @date:  2019-08-15 10:08
 * @version V1.0
 */
public class Test6 {

    public static void main(String[] args) {
        //man为Man对象
        Man man=new Man();
        if(man instanceof Man){
            System.out.println("\"success\" = " + "success");
        }
        //list为List实现类
        List<Integer> list=new ArrayList<>();
        if(list instanceof List){
            System.out.println("11111111111111");
        }
        //p是Person1对象，person1继承Man
        Person1 p=new Person1();
        if(p  instanceof Man){
            System.out.println("2222");
        }
        Man m=new Person1();
        if(m instanceof Man){
            System.out.println("\"33333\" = " + "33333");
        }


        MessageResponse<Object> mr=new MessageResponse<>();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("signal", 12131d);
        mr.setObject(hashMap);

        Object obj = mr.getObject();
        Map result = null;
        if (obj instanceof Map) {
            result = (Map)obj;
            Double signal = (Double) result.get("signal");

            int signalValue = signal.intValue();
            mr.setObject(signalValue);
            System.out.println("44444444");
        }


    }
}
