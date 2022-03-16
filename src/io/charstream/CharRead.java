package io.charstream;


import java.io.FileReader;

/**
 * 使用FileReader读取文件
 * 用于字符的读取
 */

public class CharRead {
    public static void main(String[] args) throws Exception{
        FileReader fl = new FileReader("d:\\lx\\hello.txt");
        //读取
        //1.单个字符读取
//        int data = 0;
//        while((data = fl.read()) != -1){//读取一个字符
//            System.out.print((char) data);
//        }
        //2.多个字符读取
        char[] buf = new char[1024];
        int count = 0;
        while ((count = fl.read(buf)) != -1){
            System.out.print(new String(buf,0,count));
        }

        fl.close();
    }
}
