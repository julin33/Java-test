package collection.set;
/**
 * 存储过程：
 * 1、根据hashcode计算保存位置，如果此位置为空则直接保存，如果不为空执行下一步
 * 2、执行equals，如果equals为true，则认为重复，为false则形成链表
 */

import java.util.HashSet;

public class Demo3 {
    public static void main(String[] args) {
        HashSet<Person> person = new HashSet<Person>();
        //1. 添加数据
        Person p1 = new Person("刘德华", 20);
        Person p2 = new Person("林志玲", 18);
        Person p3 = new Person("梁朝伟", 22);
        Person p4 = new Person("郭富城", 21);

        person.add(p1);
        person.add(p2);
        person.add(p3);
        person.add(p4);
        person.add(new Person("梁朝伟",22));
        //对象地址不一样所以可以添加一样的人物，重写equals和hashcode可避免重复

        System.out.println("元素个数："+person.size());
        System.out.println(person.toString());
        //2.删除 remove
        //3.遍历 foreach Iterator
        //4.判断
    }
}
