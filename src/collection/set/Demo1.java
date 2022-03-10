package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 测试set接口的使用
 * 特点：1、无序，没有下标 2、不能重复
 *
 */
public class Demo1 {
    public static void main(String[] args) {
        //创建集合
        Set<String> set = new HashSet<String>();
        //1. 添加数据
        set.add("苹果");
        set.add("小米");
        set.add("华为");
        System.out.println("集合个数" + set.size());
        System.out.println(set.toString());
        //2. 删除数据
//        set.remove("苹果");
        //3. 遍历
        System.out.println("-----------增强for-----------");
        for (String string:set) {
            System.out.println(string);
        }
        System.out.println("-----------迭代器-----------");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //4. 判断
        System.out.println(set.contains("苹果"));
        System.out.println(set.isEmpty());

    }
}
