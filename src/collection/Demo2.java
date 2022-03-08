package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * collection 的使用 ：保存学生信息
 *
 */

public class Demo2 {
    public static void main(String[] args) {
        //新建Collection 对象
        Collection collection = new ArrayList();
        Student s1 = new Student("张三",20);
        Student s2 = new Student("张无忌",18);
        Student s3 = new Student("王二", 22);
        //1、添加数据
        collection.add(s1);
        collection.add(new Student("张无忌",18));
        collection.add(s3);
        System.out.println("元素个数：" + collection.size());
        System.out.println(collection.toString());
        //2、删除
//        collection.remove(s2);
        collection.remove(new Student("张无忌",18));//要想实现需要重写equals
//        collection.clear();
        System.out.println("删除后的个数：" + collection.size());

        //3、遍历
        //增强for
        System.out.println("============增强for=============");
        for (Object object :collection) {
            System.out.println(object.toString());
        }
        //迭代器
        System.out.println("============迭代器=============");

        Iterator it = collection.iterator();
        while (it.hasNext()){
            System.out.println(it.next().toString());
        }

        //4、判断
        System.out.println(new Student("张无忌",18).hashCode());
        System.out.println(s2.hashCode());

    }
}
