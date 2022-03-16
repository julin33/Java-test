package io.filestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 使用文件字节流进行复制
 */
public class FileCopy {
    public static void main(String[] args) throws Exception{
        //1 创建流
        //1.1 文件字节输入流
        FileInputStream fis = new FileInputStream("C:\\Users\\ZHL\\Pictures\\qq.jpg");
        //1.2 文件字节输出流
        FileOutputStream fos = new FileOutputStream("D:\\QQ2.jpg");
        //2 一边读一边写
        byte[] buf = new byte[1024];
        int count = 0;
        while ((count = fis.read(buf)) != -1){
            fos.write(buf,0,count);
        }
        //3 关闭
        fis.close();
        fos.close();
        System.out.println("执行完毕");

    }
}
