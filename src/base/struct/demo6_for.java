package base.struct;

public class demo6_for {
    public static void main(String[] args) {
        int a = 1;//初始化

        while (a<=100){ //条件判断
            System.out.println(a);//循环体
            a += 2;//迭代
        }
        System.out.println("循环结束");



        //初始化值//条件判断//迭代
        for (int i = 1;i <= 100;i++){
            System.out.println(i);
        }//先执行再迭代而不是先迭代再执行
        System.out.println("循环结束");

        //for循环语句是支持迭代的一种通用结构，是最有效、最灵活的循环结构

        for (int i = 0; i < 100; i++) {
            
        }//100.for自动生成，一种高效的方法

    }
}
