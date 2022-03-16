package io;
/**
 * properties集合的使用
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo  {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();

        properties.setProperty("username","zhangsan");
        properties.setProperty("age","20");

        //遍历
        //1. keySet
        //2. entrySet
        //3. stringPropertyNames()
        Set<String> pronames = properties.stringPropertyNames();
        for (String name : pronames) {
            System.out.println(name + "=" + properties.getProperty(name));
        }

        //4. 和流有关的方法
        //--------list方法--------
        PrintWriter pw = new PrintWriter("d:\\lx\\print.txt");
        properties.list(pw);
        pw.close();

        //--------store方法--------
        FileOutputStream fos = new FileOutputStream("d:\\lx\\store.txt");
        properties.store(fos,"注释");
        fos.close();

        //--------load方法---------
        Properties properties2 = new Properties();
        FileInputStream fis = new FileInputStream("d:\\lx\\store.txt");
        properties2.load(fis);
        fis.close();
        System.out.println(properties2);


    }
}
