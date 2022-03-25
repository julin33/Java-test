package annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 通过反射动态创建对象
 */
public class TestReflection2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class c1 = Class.forName("annotation.User");

        //1. 直接构造一个对象
        User user1 = (User) c1.newInstance(); //本质上是调用了无参构造器
        System.out.println(user1);

        //2. 通过构造器创建对象
        Constructor constructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        User user2 = (User) constructor.newInstance("傻逼",1,20);//实现有参构造
        System.out.println(user2);

        //3. 通过反射调用普通方法
        //(对象，“方法的值”)
        User user3 = (User) c1.newInstance();
        Method setName = c1.getDeclaredMethod("setName", String.class);
        setName.invoke(user3,"弱智");//invoke激活user3的setName方法，并且传递一个String值
        System.out.println(user3.getName());

        //4. 通过反射操作属性
        User user4 = (User) c1.newInstance();
        Field name = c1.getDeclaredField("name");
        name.setAccessible(true);//开启权限，可以修改private属性
        name.set(user4,"脑残");
        System.out.println(user4.getName());
    }
}
