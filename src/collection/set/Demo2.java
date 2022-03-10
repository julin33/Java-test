package collection.set;

import java.util.HashSet;

/**
 * hashset的使用
 * 存储结构：哈希表（数组+列表+红黑树）
 *
 */
public class Demo2 {
    public static void main(String[] args) {
        //新建集合
        HashSet<String> hashSet = new HashSet<String>();
        //1. 添加元素
        hashSet.add("刘德华");
        hashSet.add("梁朝伟");
        hashSet.add("林志玲");
        hashSet.add("周润发");
        System.out.println("元素个数："+ hashSet.size());
        System.out.println(hashSet.toString());
        //2. 删除元素
//        hashSet.remove("刘德华");
        //3. 遍历
        //foreach Iterator
        //4.判断
        //contains isEmpty

    }
}
