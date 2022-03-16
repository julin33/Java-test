package io;

import java.io.PrintWriter;

/**
 * PrintWrite的使用
 * 把数据原封不动地打印
 */
public class PrintWt {
    public static void main(String[] args) throws Exception{
        //1. 创建打印流
        PrintWriter pw = new PrintWriter("d:\\lx\\printwt.txt");
        //2. 打印
        pw.println(97);//原本会输出a
        pw.println(true);
        pw.println(3.14);
        pw.println('a');
        //3. 关闭
        pw.close();
        System.out.println("执行完毕");

    }
}
