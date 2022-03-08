package base.scanner;

import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //从键盘接收数据
        int i = 0;
        float f = 0.0f;

        System.out.println("请输入整数：");

        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
            System.out.println("整书数据：" + i);
        }
        else {
            System.out.println("您输入的不是整数数据");
        }

        System.out.println("请输小数：");

        if (scanner.hasNextFloat()) {
            f = scanner.nextFloat();
            System.out.println("小数数据" + f);
        }
        else {
            System.out.println("您输入的不是小数数据");
        }

    }
}
