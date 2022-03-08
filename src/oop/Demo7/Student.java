package oop.Demo7;
//static
public class Student {
    private static int age;//静态变量 多线程！
    private double score;//非静态变量
    public void run(){

    }
    public static void go(){

    }

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.age);
        System.out.println(s1.score);
        System.out.println(Student.age);//静态变量能被类中的所有实例共享
//        System.out.println(Student.score);//报错

        s1.go();
        Student.go();
        go();

        s1.run();
//        Student.run();
//        run();



    }
}
