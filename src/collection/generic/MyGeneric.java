package collection.generic;

/**
 * 泛型类
 * 语法：类名<T>
 *     T是类型占位符，表示一种引用类型，如果编写多个使用逗号隔开
 */
public class MyGeneric<T> {
    //使用泛型T
    //1. 创建变量 注意不能实例化new，因为构造器不确定
    T t;

    //2. 作为方法的参数
    public void show(T t){
        System.out.println(t);
    }
    //3. 使用泛型作为方法的返回值
    public T getT(){
        return t;
    }
}
