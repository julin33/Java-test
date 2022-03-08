package oop.Demo4;

public class Application {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("julin");
        System.out.println(s1.getName());

        s1.setAge(999); //不合法的年龄自动变为3岁
        System.out.println(s1.getAge());
    }
}
