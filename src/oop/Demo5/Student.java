package oop.Demo5;

//学生 is 人 ：子类
public class Student extends Person {
    public Student() {
        //隐藏代码：默认调用了父类的无参构造器
        super();//调用父类构造器必须要在子类构造器的第一行
        System.out.println("Student的无参构造器执行了");
    }

    private String name = "julin";

    public void print(){
        System.out.println("Student");
    }

    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);//输出父类的东西
    }
    public void test1(){
        print();
        this.print();
        super.print();
    }

}
