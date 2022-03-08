package oop.Demo1;
//引用传递：引用了对象，本质还是值传递
public class demo4 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);//null
        demo4.change(person);
        System.out.println(person.name);//julin

    }
    public static void change(Person person){
        //person是一个对象： 指向的------>Person person = new Person();这是具体的一个人，可以改变属性
        person.name = "julin";
    }

}

//定义了一个Person类，有一个属性：name
class Person{
    String name;
}
