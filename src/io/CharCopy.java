package io;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * 使用FileReader和FileWriter复制文本文件，不能复制图片和二进制文件
 */
public class CharCopy {
    public static void main(String[] args) throws Exception{
        //1创建FileReader和 FileWriter
        FileReader fr = new FileReader("d:\\lx\\write.txt");
        FileWriter fw = new FileWriter("d:\\lx\\write2.txt");

        int data = 0;
        while ((data = fr.read()) != -1){
            fw.write(data);
            fw.flush();
        }

        fw.close();
        fr.close();
        System.out.println("复制完毕");
    }
}
