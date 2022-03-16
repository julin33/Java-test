package io.charstream;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 转换流InputStreamReader和OutputStreamWriter
 * 可将字节流转换成字符流
 * 可设置字符的编码方式
 */
public class ConvertStreamIn {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("d:\\lx\\write.txt");
        InputStreamReader isr = new InputStreamReader(fis,"utf-8");

        //读取文件
        int data = 0;
        while ((data = isr.read()) != -1){
            System.out.print((char) data);
        }

        isr.close();
    }
}
