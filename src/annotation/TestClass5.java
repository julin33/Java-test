package annotation;
/**
 * 如何获得类的各种信息
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestClass5 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("annotation.User");

/*
        User user = new User();
        c1 = user.getClass();
*/

        //获得类的名字
        System.out.println(c1.getName());//获得包名 + 类名
        System.out.println(c1.getSimpleName());//获得类名

        //获得类的属性
        System.out.println("====================");
      /*  Field[] fields = c1.getFields(); //只能找到public属性
        for (Field field : fields) {
            System.out.println(field);
        }
*/
        Field[] fields = c1.getDeclaredFields(); //能找到所有属性
        for (Field field: fields) {
            System.out.println(field);
        }

        //获得指定属性的值
        Field name = c1.getDeclaredField("name");
        System.out.println(name);

        //获得类的方法
        System.out.println("==========getMethods==========");

        for (Method method : c1.getMethods()) { //获得本类和父类的全部public方法
            System.out.println(method);
        }

        System.out.println("===========getDeclaredMethods=========");

        for (Method method : c1.getDeclaredMethods()) { //获得本类的所有方法
            System.out.println(method);
        }

        //获得指定方法
        System.out.println("====================");

        System.out.println(c1.getMethod("getName",null));//因为方法有重载，所以得有参数
        System.out.println(c1.getMethod("setName",String.class));

        //获得构造器
        System.out.println("==========getConstructors==========");

        for (Constructor constructor : c1.getConstructors()) { //public
            System.out.println(constructor);
        }
        System.out.println("==========getDeclaredConstructors==========");

        for (Constructor constructor : c1.getDeclaredConstructors()) { //全部
            System.out.println(constructor);
        }

        //获得指定的构造器
        System.out.println("====================");
        System.out.println(c1.getConstructor(String.class, int.class, int.class));


    }
}
