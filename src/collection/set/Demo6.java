package collection.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet集合的使用
 * Comparator：实现定制比较（比较器）
 * Comparable：可比较的
 */
public class Demo6 {
    public static void main(String[] args) {
        //使用Comparator在创建集合的同时就添加了比较规则，对单独集合定制比较
        TreeSet<Person> people = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int n1 = o1.getAge() - o2.getAge();
                int n2 = o1.getName().compareTo(o2.getName());
                return n1 == 0 ? n2 : n1;
            }//先比年龄再比性别
        });
        Person p1 = new Person("xxz", 20);
        Person p2 = new Person("nmv", 18);
        Person p3 = new Person("sda", 22);
        Person p4 = new Person("ttg", 21);

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        System.out.println(people.toString());

    }
}
