package annotation;

import java.lang.reflect.Method;
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
        for (Type genericParameterType : method.getGenericParameterTypes()) {
            System.out.println(genericParameterType);
            if 
        }

    }
}
