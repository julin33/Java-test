package exception;

public class Test {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        new Test().test(a,b);
    }
    //假设这个方法中，处理不了这个异常，方法上抛出异常
    public void test(int a, int b){
        if (b == 0){
            throw new ArithmeticException();//主动抛出异常，一般用在方法中
        }
    }


}

/*
  try{//监控区域
            if (b == 0){
                throw new ArithmeticException();//主动抛出异常
            }
            System.out.println(a/b);

        }catch (ArithmeticException e){//捕获异常,多个异常范围要从小到大
            System.out.println("程序出现异常，变量b不能为0");
            e.printStackTrace();//打印错误的栈信息
        }catch (Exception e){
            System.out.println("Exception");
        }catch (Throwable t){
            System.out.println("Throwable");
        } finally{//处理善后工作
            System.out.println("finally");
        }
        //finally 可以不要， 假设IO，资源，关闭


        //Ctrl + Alt + T 自动包裹代码
 */