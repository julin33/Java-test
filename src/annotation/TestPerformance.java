package annotation;

import java.lang.reflect.Method;
import java.text.DateFormat;

/**
 * 分析性能问题
 */
public class TestPerformance {
    //普通方法调用
    public static void test1() {
        User user = new User();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000000; i++) {
            user.getName();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("普通方式执行10亿次用时：" + (endTime - startTime) + "ms");

    }

    //通过反射调用
    public static void test2() throws Exception{
        User user = new User();
        Class c1 = Class.forName("annotation.User");
        Method getName = c1.getDeclaredMethod("getName", null);

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user,null);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("反射方式执行10亿次用时：" + (endTime - startTime) + "ms");

    }

    //通过反射调用 关闭检测
    public static void test3() throws Exception{
        User user = new User();
        Class c1 = Class.forName("annotation.User");
        Method getName = c1.getDeclaredMethod("getName", null);
        getName.setAccessible(true);//关闭检测

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user,null);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("关闭检测反射方式执行10亿次用时：" + (endTime - startTime) + "ms");

    }


    public static void main(String[] args) throws Exception{
        test1();
        test2();
        test3();
    }

}
