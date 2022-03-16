package io.filestream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Arrays;

public class BufferedInput {
    public static void main(String[] args) throws Exception{
        //1. 创建
        FileInputStream in = new FileInputStream("D:\\QQ2.jpg");
        BufferedInputStream bis = new BufferedInputStream(in);
        //2. 读取
//        int data = 0;
//        while ((data = bis.read()) != -1){
//            System.out.print(data);
//        }
        //自己也可以创建一个缓冲区
        byte[] buf = new byte[1024];
        int count = 0;
        while ((count = bis.read(buf)) != -1){
            System.out.print(Arrays.toString(buf));
        }
        //3. 关闭 （只需关闭缓冲流）
        bis.close();
    }
}
