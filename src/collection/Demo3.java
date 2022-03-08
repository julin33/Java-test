package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * list子接口的使用
 * 特点：
 * 1、有序、有下标、可重复
 *
 */
public class Demo3 {
    public static void main(String[] args) {
        //创建对象
        List list = new ArrayList<>();
        //1、添加元素
        list.add("苹果");
        list.add("小米");
        list.add(0,"华为");
        System.out.println("元素个数:" + list.size());
        System.out.println(list.toString());
        //2、删除元素
//        list.remove("苹果");
        list.remove(0);
    }

}
