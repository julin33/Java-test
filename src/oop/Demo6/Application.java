package oop.Demo6;

public class Application {
    public static void main(String[] args) {
        //类型之间的转换： 父  子
        //高                 低
        Person person = new Person();

        //person将这个对象转换为Student类型，我们就可以使用Student类型的方法了

        //高转低强制转换
        Student student = (Student) person;
        ((Student) person).eat();
        ((Student) person).go();
        //低转高自动转换,但可能丢失自己本来的一些方法
        Person person1 = student;
//        person1.eat();//丢失eat方法
    }
}
