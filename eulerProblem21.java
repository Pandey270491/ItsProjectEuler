import java.util.ArrayList;

/**
 * Created by pandey on 11/02/17.
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
 If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

 For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

 Evaluate the sum of all the amicable numbers under 10000.
 */
public class eulerProblem21 {



    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        ArrayList<Integer> amicableNumbers = new ArrayList<Integer>() ;

      //  int factorSum =0;
       // int numberInCheck = 0;

        int sumAll = 0;

        for (int i =2 ; i<=10000;i++)
        {
            if(amicableNumbers.contains(i))
            {
                continue;
            }
            else
            {

                int ithNumFactorSum = 0;
                int sumFatorsOf_ithNumFactorSum = 0;
                for (int j = 1; j <i; j++) {
                    if (i % j == 0) {
                        ithNumFactorSum += j;
                    }
                }


                for (int j = 1; j < ithNumFactorSum; j++)
                {
                    if (ithNumFactorSum % j == 0)
                    {
                        sumFatorsOf_ithNumFactorSum += j;
                    }
                }

                if (i == sumFatorsOf_ithNumFactorSum && (i !=ithNumFactorSum) )
                {
                    amicableNumbers.add(i);
                    amicableNumbers.add(ithNumFactorSum);
                }
            }
        }

        for(int i : amicableNumbers)
        {
            sumAll+=i;
        }
        System.out.println(amicableNumbers);

        System.out.println("Summ of all amicable number under 10000 is : " + sumAll);
        long endTime   = System.currentTimeMillis();

        long totalTime = endTime - startTime;

        System.out.println("Runtime for Problem 21 : " +totalTime );


    }
}
