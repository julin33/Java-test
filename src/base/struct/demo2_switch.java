package base.struct;

import java.util.Scanner;

public class demo2_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char grade = scanner.nextLine().charAt(0);
        switch (grade){
            //case 穿透 switch匹配一个具体的值
            case 'A':
                System.out.println("优秀");
                break; //可选，可以终止switch，不写的话会把后面的内容全部输出
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("及格");
                break;
            case 'D':
                System.out.println("再接再厉");
                break;
            case 'E':
                System.out.println("挂科");
                break;
            default:
                System.out.println("未知等级");
        }
        scanner.close();

    }
}
