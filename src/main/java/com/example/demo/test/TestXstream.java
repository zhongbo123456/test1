package com.example.demo.test;

import com.thoughtworks.xstream.XStream;

public class TestXstream {
    public static void main(String[] args) {
        //xml转对象
        String xml="<User>\n" +
                "<name>zz</name>\n" +
                "<age>20</age>\n" +
                "<sex>男</sex>\n" +
                "</User>";
        User user = XstreamUtil.xmlToObject(xml, User.class);
        System.out.println("user = " + user);

        //对象转xml
        User user1=new User("张三","23","男");
        XStream xStream=new XStream();
        xStream.autodetectAnnotations(true);
        String s = xStream.toXML(user1);
        System.out.println("s = " + s);


    }
}
