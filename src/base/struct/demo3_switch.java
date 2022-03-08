package base.struct;

import java.util.Scanner;

public class demo3_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        //jdk7新特性，switch可以支持字符串
        switch (name) {
            case "julin33":
                System.out.println("欢迎您julin");
                break;
            case "asswecan":
                System.out.println("欢迎您asswecan");
                break;
            default:
                System.out.println("臭gn,gck");
        }
        scanner.close();
    }
}
