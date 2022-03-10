package collection.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 要求：使用TreeSet集合实现字符串按照长度进行排序
 * helloworld zhang wangnima beijing xian nanjing juele
 */
public class Demo7 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        treeSet.add("helloworld");
        treeSet.add("zhang");
        treeSet.add("wangnima");
        treeSet.add("beijng");
        treeSet.add("xian");
        treeSet.add("nanjing");
        treeSet.add("juele");

        System.out.println(treeSet.toString());

    }
}
