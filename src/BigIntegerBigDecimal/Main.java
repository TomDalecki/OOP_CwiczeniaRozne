package BigIntegerBigDecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger bInt1 = new BigInteger(String.valueOf(1));
        BigInteger bInt2 = BigInteger.valueOf(12345);
        BigInteger bInt3 = BigInteger.ONE;
        //BigInteger bInt4 = new BigInteger(String.valueOf(12345), 2);

        System.out.println(bInt1);
        System.out.println(bInt2);
        System.out.println(bInt3);
       // System.out.println(bInt4);


        BigDecimal bDec1 = new BigDecimal("12444.0000");
        BigDecimal bDec2 = new BigDecimal(String.valueOf(12444.0000));

        System.out.println(bDec1.add(bDec2));
        System.out.println(bDec1.add(new BigDecimal(bInt1)));
    }
}
