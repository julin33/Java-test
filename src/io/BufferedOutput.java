package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * 使用字节缓冲流写入文件
 *
 */
public class BufferedOutput {
    public static void main(String[] args) throws Exception{
        FileOutputStream out = new FileOutputStream("D:\\Buffer.txt");
        BufferedOutputStream bos = new BufferedOutputStream(out);

        //写入文件
        for (int i = 0; i < 10; i++) {
            bos.write("helloworld\r".getBytes());//写入8k缓冲区
            bos.flush();//刷新到硬盘
        }

        //关闭（内部会调用flush方法）
        bos.close();


    }
}
