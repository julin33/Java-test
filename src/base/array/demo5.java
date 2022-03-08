package base.array;

import java.util.Arrays;

public class demo5 {
    public static void main(String[] args) {
        int [] a = {1,2,33,15,46,324,65,78,969};

        System.out.println(a); //[I@776ec8df 是个hashcode

        //打印数组元素 Arrays.toString
        System.out.println(Arrays.toString(a));
        System.out.println("========");
        printArray(a);

        System.out.println("========");
        //排序算法Arrays.sort:升序排序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println("========");
        //数组填充Arrays.fill
        Arrays.fill(a,2,4,0);
        //2-4下标之间的数被填充为0：即2和3（左闭右开）
        System.out.println(Arrays.toString(a));
    }


    //手打一波Arrays.toString 低配版
    public static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            if (i == 0){
                System.out.print("[" + a[i] + ", ");
            }else if (i == a.length-1){
                System.out.println(a[i] + "]");
            }else{
                System.out.print(a[i] + ", ");
            }

        }
    }
}
