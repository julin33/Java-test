package io;

import java.io.Serial;
import java.io.Serializable;

/**
 * 学生类
 */

public class Student implements Serializable {//要想序列化就必须要实现一个接口
    // (serializable里面不含任何方法，仅仅是标记此类可以序列化)
    @Serial
    private static final long serialVersionUID = -427553587245757343L;
//     serialVersionUID：序列化版本号ID


    private String name;
    private  int age;

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

}
