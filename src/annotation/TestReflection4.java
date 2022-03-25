package annotation;

import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 * 反射操作注解
 */
public class TestReflection4 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("annotation.Student2");

        //通过反射获得注解
        for (Annotation annotation : c1.getAnnotations()) {
            System.out.println(annotation);
        }
        //获得注解的value
        TypeJulin typeJulin = (TypeJulin) c1.getAnnotation(TypeJulin.class);
        String value = typeJulin.value();
        System.out.println(value);

        //获得类指定的注解
        Field field = c1.getDeclaredField("name");
        FieldJulin fieldJulin = field.getAnnotation(FieldJulin.class);
        System.out.println(fieldJulin.columnName());
        System.out.println(fieldJulin.type());
        System.out.println(fieldJulin.length());
    }
}

@TypeJulin("db_Student")
class Student2 {

    @FieldJulin(columnName = "db_id", type = "int", length = 10)
    private int id;
    @FieldJulin(columnName = "db_id", type = "int", length = 10)
    private int age;
    @FieldJulin(columnName = "db_id", type = "varchar", length = 3)
    private String name;

    public Student2 () {

    }

    public Student2(int id, int age, String name) {
        this.id = id;
        this.age = age;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

//类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface TypeJulin{
    String value();
}

//属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldJulin{
    String columnName();
    String type();
    int length();

}

