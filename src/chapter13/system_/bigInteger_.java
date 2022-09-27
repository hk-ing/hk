package chapter13.system_;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author 韩坤
 * @version 1.0
 */
public class bigInteger_ {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("123456789999999999999999999999");
        BigInteger bigInteger2 = new BigInteger("123456789999999999999999999999");
        System.out.println(bigInteger);
        BigInteger add = bigInteger.add(bigInteger2);
        System.out.println(add);
        BigDecimal bigDecimal = new BigDecimal("123.123456789789456123");
        BigDecimal bigDecimal2 = new BigDecimal("123.123456789789456123");
        System.out.println(bigDecimal);
        BigDecimal add2 = bigDecimal2.add(bigDecimal);
        System.out.println(add2);

    }
}