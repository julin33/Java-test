package exception;

//自定义异常类
public class MyException extends Exception{
    private int detail;

    public MyException(int a) {
        this.detail = a;
    }
    //toString


    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}
