import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by pandey on 11/02/17.
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

 Find the sum of all the primes below two million.
 */
public class eulerProblem10 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int twoMillion = 2000000;
        long sumOfPrimes = 2;
        boolean skipThisI =false;

        //ArrayList<Integer> primeArray = new ArrayList<Integer>();

        for(int i = 3 ; i<=2000000; i=i+2 )
        {
            skipThisI = false;
                for(int j =3 ; j<=i ; j+=2)
                {
                    if(i%j==0 && i!=j)
                    {
                        skipThisI = true;
                        break;
                    }
                }
                if(skipThisI)
                {
                    continue;
                }
                else
                {
                    sumOfPrimes+=i;
                //    System.out.println("Prime Number Found : " +i);
                }

        }
//        for (int i : primeArray)
//        {
//            sumOfPrimes+= i;
//        }

        long endTime = System.currentTimeMillis();
        float runTimeOfP10= (float)(endTime -startTime)/1000;

        System.out.println("Sum of all Prime number under 2 Million is : " + sumOfPrimes + "\nrunTime : " +runTimeOfP10 );

    }



}
