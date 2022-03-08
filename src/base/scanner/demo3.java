package base.scanner;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数据：");
        //取消if判断也可以

        String str = scanner.nextLine();
        System.out.println("输出的内容为：" + str);


        scanner.close();
    }
}
