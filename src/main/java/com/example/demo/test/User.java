package com.example.demo.test;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @ClassName: com.example.demo.test.User.java
 * @Description: User类
 * @author: zhongbo
 * @date:  2019-08-14 15:22
 * @version V1.0
 */
@XStreamAlias("User")
public class User {
    @XStreamAlias("name")
    private String name;
    @XStreamAlias("age")
    private String age;
    @XStreamAlias("sex")
    private String sex;

    public User(String name, String age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
