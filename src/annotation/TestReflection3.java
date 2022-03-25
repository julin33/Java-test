package annotation;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * 通过反射获取泛型
 */
public class TestReflection3 {
    public void test1(Map<String,User> map, List<User> list) {
        System.out.println("test1");
    }

    public Map<String,User> test2(){
        System.out.println("test2");
        return null;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method method = TestReflection3.class.getDeclaredMethod("test1", Map.class,List.class);
        for (Type genericParameterType : method.getGenericParameterTypes()) { //获取泛型参数类型
            System.out.println(genericParameterType);
            if (genericParameterType instanceof ParameterizedType) { //判断是否是参数化类型
                //强转参数化类型并且获取真实信息
                Type[] actualTypeArguments = ((ParameterizedType) genericParameterType).getActualTypeArguments();
                for (Type actualTypeArgument : actualTypeArguments) {
                    System.out.println(actualTypeArgument);
                }
            }
        }

        System.out.println("==========================");

        method = TestReflection3.class.getDeclaredMethod("test2",null);
        Type genericReturnType = method.getGenericReturnType(); //获取泛型返回值类型
        //重复上次的操作
        System.out.println(genericReturnType);
        if (genericReturnType instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) genericReturnType).getActualTypeArguments();
            for (Type actualTypeArgument : actualTypeArguments) {
                System.out.println(actualTypeArgument);
            }
        }



    }
}
