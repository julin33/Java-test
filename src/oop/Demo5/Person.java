package oop.Demo5;

//所有类都默认继承object类
// 人 :父类
public class Person {

    public Person(){
        System.out.println("Person无参构造器执行了");
    }

    //public
    //private
    //default
    //protected
    private int money = 10_0000_0000;
    protected String name = "mermer";

    public void say(){
        System.out.println(("说了一句话"));
    }

    public void print(){
        System.out.println("Person");
    }



    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
/*
   public static void main(String[] args) {
        Student student = new Student();
        student.say();//子类继承了父类拥有其方法
        student.test("baichiyao");
        student.test1();


        //ctrl + h 打开继承树，会发现所有类都继承object

 */
