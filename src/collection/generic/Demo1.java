package collection.generic;
/**
 * 泛型集合
 */

import collection.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("asd");
        arrayList.add("sadf");
        arrayList.add("e.we");
        arrayList.add("2asda");

        Iterator<String> it = arrayList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        ArrayList<Student> studentArrayList = new ArrayList<>();
        Student s1 = new Student("刘德华", 20);
        Student s2 = new Student("郭富城", 22);
        Student s3 = new Student("梁朝伟", 18);
        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);

        Iterator<Student> it2 = studentArrayList.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
