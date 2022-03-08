package cmclass.system;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        //1. arraycopy 数组复制
        //src.原数组 ， srcPos从哪个地方开始复制 ， dest目的数组 ，
        //destPos目标数组的位置 ， length复制的长度
        int[] arr1 = {20,43,12,54,15,45,23};
        int[] arr2 = new int[7];
        System.arraycopy(arr1,3,arr2,0,2);
        System.out.println(Arrays.toString(arr2));
        //Arrays.copyOf()另一种方法

        //2. currentTimeMillis()当前时间
        System.out.println(System.currentTimeMillis());
        long start = System.currentTimeMillis();
        for (int i = 0; i < 999999999; i++) {
            for (int j = 0; j < 999999999; j++) {
               int result = i+j;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("用时：" + (end - start));

        //3. System.gc() 见finalize

        //4. JVM退出
        System.exit(0);
        System.out.println("程序结束了");//提前结束后面的代码不会执行





    }
}
