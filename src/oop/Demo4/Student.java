package oop.Demo4;

public class Student {
    //属性私有
    //学生信息
    private String name;
    private  int id;
    private  char gender;
    private int  age;

    //提供一些可以操作属性的方法
    //public 的 get 和 set 的方法

    //get 获取这个数据
    public String getName() {
        return this.name;
    }
    //set 给这个数据设值
    public void setName(String name) {
        this.name = name;
    }

    //alt + insert自动生成！
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 120 || age < 0){
            this.age = 3;
        }else {
            this.age = age;
        }
    }
}
