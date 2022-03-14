package io;

import java.io.FileOutputStream;

/**
 * FileOutputStream
 * 文件字节输出流
 */
public class FileOutput {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("d:\\bbb.txt",true);
        //写入文件
//        fos.write(97);
//        fos.write('c');
//        fos.write('w');
        String string = "hello world";
        fos.write(string.getBytes());//会覆盖源文件，需要在构造方法里加true

        fos.close();
        System.out.println("执行完毕");
    }
}
