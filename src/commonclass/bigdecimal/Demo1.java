package commonclass.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

//精确计算
public class Demo1 {
    public static void main(String[] args) {

        //面试题
        double result = (1.4 - 0.5) / 0.9;
        System.out.println(result);
        //BigDecimal 大精度浮点数精确计算
        BigDecimal bd1 = new BigDecimal("1.0");
        BigDecimal bd2 = new BigDecimal("0.9");
        //减法
        BigDecimal r1 = bd1.subtract(bd2);
        System.out.println(r1);
        //加法
        BigDecimal r2 = bd1.add(bd2);
        System.out.println(r2);
        //乘法
        BigDecimal r3 = bd1.multiply(bd2);
        System.out.println(r3);
        //除法
        BigDecimal r4 = new BigDecimal("1.4").subtract(new BigDecimal("0.5")).divide(new BigDecimal("0.9"));
        System.out.println(r4);

        System.out.println(new BigDecimal("10").divide(new BigDecimal("3"),2, RoundingMode.HALF_UP));
        //保留2位小数并且四舍五入，否则会报错
    }
}
