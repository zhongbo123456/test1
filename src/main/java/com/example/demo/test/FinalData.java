package com.example.demo.test;

import java.util.Arrays;
import java.util.Random;

/**
 * @Title: final
 * @ClassName: com.example.demo.test.FinalData.java
 * @Description: final测试
 * @author: zhongbo
 * @date:  2019-08-15 17:03
 * @version V1.0
 */
public class FinalData {
    private static Random rand=new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }
    private final int valueOne=9;
    private static final int VALUE_TWO=99;
    public static final int VALUE_THREE=39;
    private final int i4=rand.nextInt(20);
    static final int INT_5=rand.nextInt(20);
    private Value v1=new Value(11);
    private final Value v2=new Value(22);
    private static final Value VAL_3=new Value(33);
    private final int[] a={1,2,3,4,5,6};

    @Override
    public String toString() {
        return "FinalData{" +
                "id='" + id + '\'' +
                ", valueOne=" + valueOne +
                ", i4=" + i4 +
                ", v1=" + v1 +
                ", v2=" + v2 +
                ", a=" + Arrays.toString(a) +
                '}';
    }

    public static void main(String[] args) {
        FinalData fd1=new FinalData("fd1");
        //fd1.valueOne++; //can not change value
        fd1.v2.i++;
        fd1.v1=new Value(9);
        for(int i=0;i<fd1.a.length;i++){
            fd1.a[i]++;
        }
        //fd1.v2=new Value(0); can not
        //fd1.VAL_3=new Value(1); //change reference
        //fd1.a=new int[3];
        System.out.println(fd1);
        System.out.println("creating new FinalData");
        FinalData fd2=new FinalData("fd2");
        System.out.println(fd1);
        System.out.println(fd2);
    }
}
