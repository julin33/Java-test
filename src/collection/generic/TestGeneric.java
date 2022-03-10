package collection.generic;

public class TestGeneric {
    //使用泛型类创建对象
    //1. 泛型只能是应用类型 2. 不同泛型类型对象之间不能相互赋值
    public static void main(String[] args) {
        MyGeneric<String> myGeneric = new MyGeneric<String>();
        myGeneric.t = "hello";
        myGeneric.show("大家好，你妈死了");
        String str = myGeneric.getT();

        MyGeneric<Integer> integerMyGeneric = new MyGeneric<Integer>();
        integerMyGeneric.t = 100;
        integerMyGeneric.show(999);
        int num = integerMyGeneric.getT();

        //泛型接口
        MyInterfaceImpl Impl = new MyInterfaceImpl(); //写实现类的时候就确定类型
        Impl.server("你妈嗨");

        MyInterfaceImpl2<Integer> Impl2 = new MyInterfaceImpl2<Integer>(); //使用的时候再声明类型
        Impl2.server(6666);

        //泛型方法
        MyGenericMethod myGenericMethod = new MyGenericMethod();
        myGenericMethod.show("绝了");
        myGenericMethod.show(100);
        myGenericMethod.show(3.14);


    }


}
