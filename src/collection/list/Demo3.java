package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * list子接口的使用
 * 特点：
 * 1、有序、有下标、可重复
 *
 */
public class Demo3 {
    public static void main(String[] args) {
        //创建对象
        List list = new ArrayList();
        //1、添加元素
        list.add("苹果");
        list.add("小米");
        list.add(0,"华为");
        System.out.println("元素个数:" + list.size());
        System.out.println(list.toString());
        //2、删除元素
//        list.remove("苹果");
//        list.remove(0);
//        System.out.println("删除之后个数" + list.size());
//        System.out.println(list.toString());
        //3、遍历操作
        //使用for进行遍历
        System.out.println("--------------3.1使用for进行遍历------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //使用增强for
        System.out.println("--------------3.2使用增强for------------");

        for (Object object :list) {
            System.out.println(object);
        }
        //使用迭代器
        System.out.println("--------------3.3使用迭代器-----------");
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //使用列表迭代器
        //和Iterator的区别：ListIterator可以向前和向后遍历，添加、删除、修改元素
        System.out.println("--------------3.4使用列表迭代器-----------");
        ListIterator lit = list.listIterator();
        while (lit.hasNext()) {
            System.out.println(lit.nextIndex() + ":" + lit.next());
        }

        while (lit.hasPrevious()){
            System.out.println(lit.previousIndex() + ":" + lit.previous());
        }

        //判断
        System.out.println("--------------4.判断-----------");
        System.out.println(list.contains("苹果"));
        System.out.println(list.isEmpty());


    }

}
