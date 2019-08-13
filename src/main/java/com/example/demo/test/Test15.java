package com.example.demo.test;

import java.io.*;

/**
 * @ClassName: com.example.demo.test.Test15.java
 * @Description: BufferedWriter和BufferedReader
 * @author: zhongbo
 * @date:  2019-08-13 18:02
 * @version V1.0
 */
public class Test15 {
    public static void main(String[] args) {
        try {
            //向a.txt写入
         /*   FileWriter fileWriter=new FileWriter("a.txt");
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write("hello world");
            bufferedWriter.newLine();//换行起到分隔作用
            bufferedWriter.write("ni hao ");
            bufferedWriter.flush();
            bufferedWriter.close();*/
         //从a.txt读
            Reader reader=new FileReader("a.txt");
            BufferedReader bufferedReader=new BufferedReader(reader);
            String content="";
            String line=null;
            while ((line= bufferedReader.readLine())!=null){
                content+=line;
            }
            System.out.println("content = " + content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
