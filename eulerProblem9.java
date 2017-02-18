import java.util.ArrayList;
import java.util.List;

/**
 * Created by pandey on 11/02/17.
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

 a2 + b2 = c2
 For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

 There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 Find the product abc.
 */
public class eulerProblem9 {
    public static void main(String[] args) {
        long startTime= System.currentTimeMillis();

        boolean tripletFlag = false;

        for(int i=1; i<=999; i++)
        {
           for(int j = i+1 ; j<=999 ; j++)
           {
               long sumOfSquare = i*i + j*j;
               //System.out.println(sumOfSquare);
               if(  i + j + Math.sqrt(sumOfSquare) == 1000)
               {
                   System.out.println("Triplet Found : " + i + "\n"+j + "\n"+Math.sqrt(sumOfSquare));
                   System.out.println("Product of the triplets : " + (long)(i*j*Math.sqrt(sumOfSquare)));
                   tripletFlag = true;
                   break;
               }

           }
           if(tripletFlag)
           {
               break;
           }

        }
        long endTime= System.currentTimeMillis();
        long runtime = endTime-startTime;

        System.out.println("RunTime for problem 9 in ms : " + runtime );



    }
}
