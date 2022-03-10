package collection.set;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * treeset的使用
 * 存储结构：红黑树
 *
 */
public class Demo4 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("asd");
        treeSet.add("zxc");
        treeSet.add("nmsl");
        System.out.println("元素个数："+ treeSet.size());
        System.out.println(treeSet.toString());

//        treeSet.remove("zxc");

        for (String string:treeSet) {
            System.out.println(string);
        }

        System.out.println("----------------------");

        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("----------------------");

        System.out.println(treeSet.contains("nmsl"));
        System.out.println(treeSet.isEmpty());
    }

}
