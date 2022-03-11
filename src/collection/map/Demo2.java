package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * HashMap的使用
 * 存储结构：哈希表
 * 源码分析：
 * 1、当HashMap创建时，table是null，为了节省空间，当添加第一个元素时，table的容量调整为16
 * 2、当元素个数大于阈值（16*0.75=12）时，会惊醒扩容，扩容后大小为原来的2倍，目的是减少调整元素的个数
 * 3、jdk1.8 当每个链表长度大于8，并且元素个数大于等于64时，会调整为红黑树
 * 4、jdk1.8 当链表长度小于6时，调整为链表
 * 5、jdk1.8之前，链表是头插入，jdk1，8以后是尾插人
 */
public class Demo2 {
    public static void main(String[] args) {
        HashMap<Student, String> students = new HashMap<>();
        Student s1 = new Student("傻逼", 001);
        Student s2 = new Student("弱智", 002);
        Student s3 = new Student("脑瘫", 003);

        students.put(s1,"北京");
        students.put(s2,"上海");
        students.put(s3,"广州");
        students.put(new Student("脑瘫",003),"杭州");
        System.out.println("元素个数："+students.size());
        System.out.println(students.toString());

//        遍历

        for (Student key : students.keySet()) {
            System.out.println(key + "=" + students.get(key));
        }

        System.out.println("---------------------------");

        for (Map.Entry<Student,String> entry : students.entrySet()) {
            System.out.println(entry);
        }

    }
}

