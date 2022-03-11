package collection.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * TreeMap的使用
 */
public class Demo3 {
    public static void main(String[] args) {
        TreeMap<Student, String> treeMap = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int n1 = o1.getId() - o2.getId();
                int n2 = o1.getName().compareTo(o2.getName());
                return n1 == 0 ? n2 : n1;
            }
        });
        Student s1 = new Student("傻逼", 001);
        Student s2 = new Student("弱智", 002);
        Student s3 = new Student("脑瘫", 003);

        treeMap.put(s1,"北京");
        treeMap.put(s2,"上海");
        treeMap.put(s3,"深圳");

        System.out.println("元素个数："+treeMap.size());
        System.out.println(treeMap.toString());

        for (Student key : treeMap.keySet()) {
            System.out.println(key + "=" + treeMap.get(key));
        }
        System.out.println("-----------------");
        for (Map.Entry entry : treeMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
