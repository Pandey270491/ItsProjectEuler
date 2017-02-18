import java.math.BigInteger;

/**
 * Created by pandey on 11/02/17.
 * 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

 What is the sum of the digits of the number 2^1000?
 */
public class eulerProblem16 {
    public static void main(String[] args) {
        BigInteger powerValue = new BigInteger("2");
        powerValue=powerValue.pow(1000);  //(long)Math.pow(2,1000);

        int sumOfPowValue = 0;
        System.out.println(powerValue);
       String powValueStr = powerValue.toString();
        for(int i=0;i<powValueStr.length();i++)
        {

            int digit =Integer.parseInt(""+powValueStr.charAt(i));
            System.out.println(digit);
            sumOfPowValue+=digit;

        }
        System.out.println(sumOfPowValue);




    }
}
