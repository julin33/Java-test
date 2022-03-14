package io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * 使用ObjectInputStream实现反序列化（读取重构成对象）
 *
 */
public class ObjectInput {
    public static void main(String[] args) throws  Exception{
        //1.创建对象流
        FileInputStream fis = new FileInputStream("d:\\lx\\stu.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        //2. 读取文件（反序列化）
        ArrayList<Student> list = (ArrayList<Student>)ois.readObject();
//        Student s1 = (Student)ois.readObject();
//        Student s2 = (Student)ois.readObject();
//      不能重复读取同一个对象

        //3. 关闭
        ois.close();
        System.out.println("执行完毕");
//        System.out.println(s1.toString());
//        System.out.println(s2.toString());
        System.out.println(list.toString());

    }
}
