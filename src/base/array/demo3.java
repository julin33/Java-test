package base.array;

public class demo3 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};
        //方法一；增强for循环
        //前面是数组内其中一个值，后面是整个数组
//        for (int base.array : arrays) {
//            System.out.println(base.array);
//        }

        //方法二
        printArray(arrays);
        int[] reverse = reverse(arrays);
        System.out.println();
        printArray(reverse);

    }
    //打印数组元素
    public static void printArray(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
    }

    //反转数组
    public static int[] reverse(int[] arrays){
        int[] result = new int[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            result[arrays.length - 1 - i] = arrays[i];
        }
        return result;

    }

}
