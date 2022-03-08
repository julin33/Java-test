package oop.Demo10;

//内部类

public class Outer {
    private int id;
    public void out(){
        System.out.println("这是外部类的方法");
    }
    public class Inner{
        public void in(){
            System.out.println("这是内部类的方法");
        }
        //获得外部类的私有属性
        public void getID(){
            System.out.println(id);
        }
    }

    //局部内部类：在方法里面
    public void method(){
        class inner{
        }
    }

}

//一个java类中可以与多个class类，但是只能有一个public class
class A{
    public void eat(){
        System.out.println("eat");
    }
}
