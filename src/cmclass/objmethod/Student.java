package cmclass.objmethod;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //重写覆盖equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//1、判断两个对象是否是同一个引用
        if (o == null || getClass() != o.getClass()) return false;//2、判断o是否为null || 判断是否为同一个类型
        Student student = (Student) o;//3、强制类型转换
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + "对象被回收了");
    }
}
