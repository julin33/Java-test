package base.scanner;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        //创建一个扫描器接受键盘数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next方式接收：");
        //判断用户有没有输入字符串
        if (scanner.hasNext()){
            //使用next方式接收
            String str = scanner.next();
            System.out.println("输入的内容为：" + str);
        }
        //凡是属于IO流的类，如果不关闭会一直占用资源
        scanner.close();
    }
}
