import java.math.BigInteger;

/**
 * Created by pandey on 11/02/17.
 */
public class eulerProblem20 {
    public static void main(String[] args) {
        byte inputDigit = 100;
        BigInteger product = new BigInteger("1");

        for(int strProduct = inputDigit; strProduct > 1; --strProduct) {
            product = BigInteger.valueOf((long)strProduct).multiply(product);
        }

        String var4 = "" + product;
        System.out.println("Sum for Factorial " + sumDigits(var4));
    }

    public static long sumDigits(String factorial) {
        long digitSum = 0L;

        for(byte i = 0; factorial.length() > 1; factorial = factorial.substring(i + 1, factorial.length())) {
            int digit = Integer.valueOf(factorial.substring(i, i + 1)).intValue();
            digitSum += (long)digit;
        }

        digitSum += (long)Integer.valueOf(factorial).intValue();
        return digitSum;
    }
}
