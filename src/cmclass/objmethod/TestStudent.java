package cmclass.objmethod;

//getClass

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("aaa",20);
        Student s2 = new Student("bbb", 22);
        //判断s1和s2是不是同一个类型
        Class class1 = s1.getClass();
        Class class2 = s2.getClass();

        if (class1 == class2){
            System.out.println("属于同一个类型");
        }else{
            System.out.println("不属于同一个类型");
        }
        System.out.println("====================");

        //hashCode方法
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println("====================");
        //toString方法 重写后
        System.out.println(s1.toString());
        System.out.println(s2.toString());

        //equals方法，判断两个对象是否相等
        System.out.println("====================");
        System.out.println(s1.equals(s2));

        Student s3 = new Student("小明", 17);
        Student s4 = new Student("小明",17);
        System.out.println(s3.equals(s4));

    }
}
