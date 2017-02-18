/**
 * Created by pandey on 15/02/17.
 */

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by pandeys on 2/15/2017.
 * A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.

 A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this sum exceeds n.

 As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of two abundant numbers is 24.
 By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers. However, this upper limit cannot be reduced any further by analysis even though it is known that the greatest number that cannot be expressed as the sum of two abundant numbers is less than this limit.

 Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
 */
public class EulerProblem23 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int maxLimit = 200;


        ArrayList<Integer> abundantArrayList = new ArrayList<Integer>();


        populateAbundantNumbersInList(maxLimit, abundantArrayList);
        System.out.println(abundantArrayList + "\nSize Of List : " + abundantArrayList.size());

        //int sum = 0;
        ArrayList<Integer> sum = new ArrayList<Integer>() ;
        ArrayList<Integer> subList = new ArrayList<Integer>() ;
        for(int num =2 ; num < maxLimit; num=num+2)
        {
            System.out.println("----------->N : " +num);

            for (int o : abundantArrayList)
            {
                if(o<num)
                {
                   //if(!subList.contains(o))
                    //{
                        subList.add(o);
                    //}
                }
            }

          //  System.out.println("Sublist for num :" + num +" is :\n"+subList);

            boolean numIsSumOfAbundantNumber= false;
            boolean goToNextNum = false;

            for(int i = 0 ; i<subList.size(); i++ )
            {
                int num1 = subList.get(i);

                 for (int j= 0 ; j<subList.size();j++)
                 {
                     if(num1==subList.get(j))
                     {
                         System.out.println("avaoiding adding same abundant number twice");
                         continue;
                     }
                     else if((num1 + subList.get(j)) == num )
                     {
                         System.out.println("Num is perfect sum");
                         numIsSumOfAbundantNumber= true;
                         break;

                     }
                 }
                if(numIsSumOfAbundantNumber)
                {
                   // goToNextNum = true;
                    break;
                }
                else
                {
                    sum.add(num);
                }


            }
//            if(!goToNextNum)
//            {
//
//               // System.out.println(num);
//               // sum+=num;
//                sum.add(num);
//            }

            subList.clear();

        }

        //System.out.println(sum);

        System.out.println("Final Numbers : " + sum);
        long endTime = System.currentTimeMillis();
        System.out.println("Runtime for Problem 23 : " + (endTime-startTime));

    }

    public static void populateAbundantNumbersInList(int maxLimit, ArrayList<Integer> list) {

        for(int j = 1; j<=maxLimit ; j++) {
            int sumOfDivisors = 0;
            for (int i = 1; i < j; i++) {
                if (j % i == 0) {
                    sumOfDivisors += i;
                }
            }
            if (sumOfDivisors > j) {
                //System.out.println("ABUNDANT NUMBER FOUND");
                list.add(j);
            }
        }
    }
}


