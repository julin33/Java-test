package base.array;

import java.util.Arrays;

public class demo6 {
    public static void main(String[] args) {
        int[] array = {3,4,1,6,8,45,12,34,65};
        sort(array);//数组是引用传递，所以即使没有return仍能排序成功
        System.out.println(Arrays.toString(array));
    }

    //冒泡排序
    //比较数组中相邻的两个元素，如果第一个数比第二个数大，我们就交换他们的位置
    //每一次比较都会产生一个最大或者最小的数字
    //下一轮则可以少一次排序
    //依次循环直到结束

    public static void sort(int[] array){
        //外层循环，判断要走多少次
        int tmp = 0;
        for (int i = 0; i < array.length-1; i++) {//-1可以防止溢出
            //内层循环比较两个数，如果第一个数比第二个数大，则交换位置
            boolean flag = false;//通过flag减少没有意义的比较，内层如果没有交换的项目则说明已经排好顺序
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] > array[j+1]){
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = true;
                }
            }
            if (flag == false){
                break;
            }
        }
    }
}
