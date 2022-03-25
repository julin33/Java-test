package annotation;

/**
 * 什么是反射
 */
public class TestReflection1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //通过反射获取类的Class对象
        Class c1 = Class.forName("annotation.User");
        Class c2 = Class.forName("annotation.User");
        Class c3 = Class.forName("annotation.User");
        Class c4 = Class.forName("annotation.User");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
        //hashcode相同，一个类只有一个class对象
        //一个类被加载之后，整个结构都被封装在class对象中 （getClass方法也可获取）

    }
}

//实体类:pojo entity
class User {
    private String name;
    private int id;
    private int age;

    public User(){

    }

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}