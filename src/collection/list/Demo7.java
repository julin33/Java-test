package collection.list;
/**
 * LinkedList的使用
 */
import collection.Student;

import java.util.LinkedList;
import java.util.ListIterator;


public class Demo7 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Student s1 = new Student("刘德华", 20);
        Student s2 = new Student("郭富城", 22);
        Student s3 = new Student("梁朝伟", 18);
        linkedList.add(s1);
        linkedList.add(s2);
        linkedList.add(s3);
        System.out.println("元素个数为："+ linkedList.size());
        System.out.println(linkedList.toString());
        //迭代器
        ListIterator lit = linkedList.listIterator();
        while(lit.hasNext()){
            System.out.println(lit.next());
        }

    }

}
