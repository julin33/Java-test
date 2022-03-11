package collection;
/**
 * Collections实现类
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {
    public static void main(String[] args) {
       List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(8);
        list.add(44);
        list.add(15);
        list.add(35);

        //sort排序
        System.out.println("排序之前："+list.toString());
        Collections.sort(list);
        System.out.println("排序之后："+list.toString());

        //binarySearch二分类查找
        System.out.println(Collections.binarySearch(list, 8));

        //copy复制
        List<Integer> dest = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {//dest大小为0，不能直接copy,所以得先填充0
            dest.add(0);
        }
        Collections.copy(dest,list);
        System.out.println(dest.toString());

        //reverse反转
        Collections.reverse(list);
        System.out.println(list.toString());

        //shuffle打乱
        Collections.shuffle(list);
        System.out.println(list.toString());

        //补充：list转成数组
        Integer[] arr = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));

        //数组转成集合
    }
}
