package base.scanner;

import java.util.Scanner;

public class demo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //输入多个数字，并求其平均数，每输入一个数字用回车确认，通过输入非数字结束输入并输入执行结果
        double sum = 0;
        //计算输入了多少个数字
        int m = 0;
        //通过循环判断是否有输入，并在里面对每一次进行求和统计
        while (scanner.hasNextDouble()) {
            double x = scanner.nextDouble();
            m++;
            sum += x;
            System.out.println("您输入了第" + m +"个数据，当前结果为" + sum);
        }
        System.out.println(m + "个数的和即为" + sum);
        System.out.println(m + "个数的平均数即为" + (sum / m));
        scanner.close();

    }
}
