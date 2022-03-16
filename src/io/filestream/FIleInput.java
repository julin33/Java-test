package io.filestream;

import java.io.FileInputStream;

/**
 * FileInputStream的使用
 * 文件字节输入流
 */
public class FIleInput {
    public static void main(String[] args) throws Exception {
        //1、创建FileInputStrException路径
        FileInputStream fis = new FileInputStream("D:\\lx\\hello.txt");
        //2、读取文件
        //2.1 单个字节读取
//        int data = 0;
//        while ((data = fis.read()) != -1) {
//            System.out.print((char)data);
//        }

        //2.2 多个字节读取


        byte[] buf = new byte[1024];
        int count = 0;
        while ((count = fis.read(buf)) != -1){
            System.out.println(new String(buf,0,count));
        }

        fis.close();
        System.out.println();
        System.out.println("执行完毕");
    }
}
