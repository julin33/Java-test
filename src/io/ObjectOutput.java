package io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * 使用ObjectOutputStream实现对象序列化
 * java对象转其他对象（比如文件对象），就叫序列化，反过来就是反序列化。和Python中一样
 * 要求：
 * （1）序列化的类必须要实现Serializable接口
 * （2）序列化类中的对象属性实现Serializable接口
 * （3）serialVersionUID：序列化版本号ID，保证序列化的类和反序列化的类是同一个类
 * （4）如果使用transient（瞬间的，存在内存当中）修饰属性，那么这个对象就不能序列化
 * （5）静态属性也不能序列化
 * （6）序列化多个对象可以借助集合实现
 */
public class ObjectOutput  {
    public static void main(String[] args) throws Exception{
        //1. 创建对象流
        FileOutputStream fos = new FileOutputStream("D:\\lx\\stu.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        //2. 序列化（写入操作)
        Student s1 = new Student("张三", 20);
        Student s2 = new Student("李四",22);
        ArrayList list = new ArrayList();
        list.add(s1);
        list.add(s2);
        oos.writeObject(list);


        //3. 关闭
        oos.close();
        //，如果我们写入的文件大小刚好和缓冲区容量一致时，就会自动将文件写入到路径中，如果不满，就需要close或flush
        System.out.println("序列化完毕");


    }
}
