package base.struct;

public class demo10_for {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};//定义了一个数组

        for (int i = 0;i < 5;i++){
            System.out.println(numbers[i]);
        }

        System.out.println("=============");

        //增强for循环，遍历数组的元素
        for (int x:numbers){
            System.out.println(x);
        }
    }
}
