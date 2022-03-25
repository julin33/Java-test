package annotation;

import java.util.ArrayList;
import java.util.List;
public class Test1 extends Object{
    //@Override 重写的注解
    @Override
    public String toString() {
        return super.toString();
    }

    // @Deprecated 不推荐程序员使用，或者存在更好的方式，但是可以使用
    @Deprecated
    public void test () {
        System.out.println("Deprecated");
    }

    //SuppressWarnings 镇压警告
    @SuppressWarnings("all")
    public void test2 () {
        List list = new ArrayList();
    }

}
