package base.struct;


import java.util.Scanner;

public class demo1_if {
    public static void main(String[] args) {
        Scanner sacnner = new Scanner(System.in);
        System.out.println("请输入成绩：");
        double score = sacnner.nextDouble();
        if (score < 60) {
            System.out.println("不合格");
        }
        else if (score >= 60 && score < 70) {
            System.out.println("合格");
        }
        else if (score >= 70 && score <90) {
            System.out.println("良");
        }
        else if (score >= 90 && score <= 100){
            System.out.println("优秀");
        }
        else {
            System.out.println("成绩不合法");
        }
        sacnner.close();
    }
}
