package collection.set;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * 使用TreeSet保存数据
 * 存储结构：红黑树
 * 要求：实现comparable接口，Compare(to)返回值为0，则认为是相同元素
 *
 */
public class Demo5 {
    public static void main(String[] args) {
        TreeSet<Person> person = new TreeSet<>();
        Person p1 = new Person("刘德华", 20);
        Person p2 = new Person("林志玲", 18);
        Person p3 = new Person("梁朝伟", 22);
        Person p4 = new Person("郭富城", 21);

        person.add(p1);
        person.add(p2);
        person.add(p3);
        person.add(p4);
        System.out.println("元素个数：" + person.size());
        System.out.println(person.toString());//会出现ClassCastException，因为没添加Comparable规则

//        person.remove(new Person("刘德华", 20));//通过CompareTo比较
//        System.out.println("剩余元素个数:"+person.size());

        for (Person per : person) {
            System.out.println(per);
        }

        System.out.println("------------------");

        Iterator<Person> iterator = person.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
