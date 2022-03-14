package io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class CharBufferWt {
    public static void main(String[] args) throws Exception{
        FileWriter fw = new FileWriter("d:\\lx\\writeBuffer.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = 0; i < 10; i++) {
            bw.write("你妈也死了哈哈哈");
            bw.newLine();//写入一个换行符 比起\r\n兼容性更好
            bw.flush();
        }

        bw.close();
        System.out.println("执行完毕");
    }
}
