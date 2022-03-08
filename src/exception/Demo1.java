package exception;

public class Demo1 {
    public static void main(String[] args) {
        new Demo1().a();
    }

    public void a(){
        b();
    }
    public void b(){
        a();
    }
}
