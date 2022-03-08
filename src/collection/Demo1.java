package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection接口使用
 * 1、 添加元素
 * 2、 删除元素
 * 3、 遍历元素
 * 4、 判断
 */
public class Demo1 {
    public static void main(String[] args) {
        //创建集合
        Collection collection = new ArrayList();
        //添加元素
        collection.add("苹果");
        collection.add("西瓜");
        collection.add("榴莲");
        System.out.println("元素个数" + collection.size());
        System.out.println(collection);
        //删除元素
//        collection.remove("榴莲");
//        System.out.println(collection.size());
//        collection.clear(); 清空元素

        //遍历元素
        //使用增强for（注意collection没有下标）
        System.out.println("--------------3.1使用增强for-----------------");
        for (Object object: collection) {
            System.out.println(object);
        }
        //使用迭代器（专门用来遍历集合的一种方式）
        //hasNext() 有没有下一个元素
        //next() 获取下有一个元素
        //remove() 删除当前元素
        System.out.println("--------------3.2使用迭代器-----------------");

        Iterator it = collection.iterator();
        while(it.hasNext()){
//            String s = (String) it.next(); //object强转String
            System.out.println(it.next());
//            collection.remove(s); //注意删除元素不用上面的方法，不允许并发修改
//            it.remove();//使用迭代器自身的remove
        }
        System.out.println(collection.size());

        System.out.println("---------------4.判断---------------");
        System.out.println(collection.contains("西瓜"));//判断集合是否包含
        System.out.println(collection.isEmpty());//判断集合是否为空
    }
}
