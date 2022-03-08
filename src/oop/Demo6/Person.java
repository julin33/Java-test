package oop.Demo6;

public class Person {
    public void run(){
        System.out.println("run");
    }
    public void go(){
        System.out.println("go");
    }

}

/*
 public static void main(String[] args) {

        //一个对象的实际类型是确定的
        //new Student();
        //new Person();
        //可以指向的引用类型就不确定了

        //student 能调用的方法都是自己的或者继承父类的
        Student s1 = new Student();
        //Person 父类可以指向子类，但不能调用子类独有的方法
        Person s2 = new Student();//父类的引用指向子类
        Object s3 = new Student();

        //能执行哪些方法，主要看对象左边的类型，和右边关系不大
        //子类重写了父类的方法，执行子类的方法
        s2.run();
        s1.run();

        ((Student)s2).eat();//强制转换student才能调用eat方法
        s1.eat();


    }

 */

/*
instanceof 的使用

public static void main(String[] args) {
        Object object = new Student();

        System.out.println(object instanceof Student);
        System.out.println(object instanceof Person);
        System.out.println(object instanceof Object);
        System.out.println(object instanceof Teacher); //false
        System.out.println(object instanceof String); //false

        System.out.println("============================");

        Person person = new Student();
        System.out.println(person instanceof Student);
        System.out.println(person instanceof Person);
        System.out.println(person instanceof Object);
        System.out.println(person instanceof Teacher); //false

        System.out.println("============================");

        Student student = new Student();
        System.out.println(student instanceof Student);
        System.out.println(student instanceof Person);
        System.out.println(student instanceof Object);
//        System.out.println(student instanceof Teacher); //false

        System.out.println("============================");

        Person person1 = new Person();

        System.out.println(person1 instanceof Student);
        System.out.println(person1 instanceof Person);
        System.out.println(person1 instanceof Object);
        System.out.println(person1 instanceof Teacher);


    }
 */

/*
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
 */