package collection.list;

import collection.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * ArrayList的使用
 * 
 */
public class Demo5 {
    public static void main(String[] args) {
        //创建集合
        ArrayList arraylist = new ArrayList<>();
        //1.添加元素
        Student s1 = new Student("刘德华", 20);
        Student s2 = new Student("郭富城", 22);
        Student s3 = new Student("梁朝伟", 18);
        //2.删除元素
        arraylist.add(s1);
        arraylist.add(s2);
        arraylist.add(s3);
        System.out.println("元素个数：" + arraylist.size());
        System.out.println(arraylist.toString());
        //3.删除元素
//        arraylist.remove(new Student("刘德华",20)); //重写equals
//        System.out.println("删除之后大小："+arraylist.size());
        //4.遍历
        System.out.println("-------------迭代器----------------");

        //迭代器
        Iterator it = arraylist.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("-------------列表迭代器----------------");
        //列表迭代器
        ListIterator lit = arraylist.listIterator();
        while (lit.hasNext()) {
            System.out.println(lit.next());
        }
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }

        //判断
        System.out.println(arraylist.contains(new Student("刘德华", 20)));
        System.out.println(arraylist.isEmpty());

        //查找
        System.out.println(arraylist.indexOf(new Student("刘德华",20)));
    }
}
