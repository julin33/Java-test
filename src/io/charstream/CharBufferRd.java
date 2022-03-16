package io.charstream;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * 使用字符缓冲流读取文件BufferedReader
 */
public class CharBufferRd {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("d:\\lx\\write.txt");
        BufferedReader br = new BufferedReader(fr);

        //1. 第一种方式
//        char[] buf = new char[1024];
//        int count = 0;
//        while ((count = br.read(buf)) != -1){
//            System.out.print(new String(buf,0,count));
//        }

        //2. 第二种方式 一行一行的读取
        String line = null;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }

        br.close();
        System.out.println("执行完毕");
    }
}
