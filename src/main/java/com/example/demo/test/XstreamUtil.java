package com.example.demo.test;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 * @ClassName: com.example.demo.test.XstreamUtil.java
 * @Description: xml转换bean工具类
 * @author: zhongbo
 * @date:  2019-08-14 15:26
 * @version V1.0
 */
public class XstreamUtil {
    public static <T> T xmlToObject(String xml,Class<T> cls){
        XStream xStream=new XStream(new DomDriver());
        //xstream使用注解转换
        xStream.processAnnotations(cls);
        return (T) xStream.fromXML(xml);
    }

}
