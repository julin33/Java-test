package collection.generic;

/**
 * 泛型方法
 * 语法：<T> 返回值类型
 *
 */
public class MyGenericMethod {
    //泛型方法
    public <T> T show(T t){ //T可作为参数也可以作为返回值
        System.out.println("泛型方法" + t);
        return t;
    }
}
