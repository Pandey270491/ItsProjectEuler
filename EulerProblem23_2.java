import java.util.ArrayList;

/**
 * Created by pandey on 18/02/17.
 * * A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.

 A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this sum exceeds n.

 As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of two abundant numbers is 24.
 By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers.
 However, this upper limit cannot be reduced any further by analysis even though it is known that the greatest number that cannot be expressed as the sum of two abundant numbers is less than this limit.

 Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.

 ************************* RUN TIME ALERT : 31-33 secs apprx ***************************
 */
public class EulerProblem23_2 {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        int maxLimit = 28124;


        ArrayList<Integer> abundantArrayList = new ArrayList<Integer>();


        populateAbundantNumbersInList(maxLimit, abundantArrayList);
        //System.out.println(abundantArrayList + "\nSize Of List : " + abundantArrayList.size());

        int finalSum = getFinalSum(maxLimit, abundantArrayList);
        System.out.println("Final sum of positive numbers which cannot be represented as sum of two abundant numbers is  : " + finalSum);

        long endTime = System.currentTimeMillis();
        System.out.println("Runtime for Problem 23 : " + (endTime - startTime));
    }


    public static int getFinalSum(int maxLimit, ArrayList<Integer> abundantArrayList) {
        //int sum = 0;
        ArrayList<Integer> sum = new ArrayList<Integer>();
        ArrayList<Integer> subList = new ArrayList<Integer>();
        for (int num = 1; num <= maxLimit; num ++) {
//
//            for (int o : abundantArrayList) {
//
//                if (o < num) {
//                    if(!subList.contains(o))
//                    {
//                        subList.add(o);
//                    }
//                }
//            }

            boolean numIsSumOfAbundant = false;

            for(int x =0 ; x<abundantArrayList.size();x++)
            {
                int tmp = abundantArrayList.get(x);

                if((num-tmp) >=tmp && (abundantArrayList.contains(num-tmp)))
                {
                    numIsSumOfAbundant = true;
                    break;
                }

            }

            if(!numIsSumOfAbundant)
            {
                sum.add(num);
            }

        }

        int finalSum =0;
        for (int n : sum)
        {
            finalSum+= n;
        }
        return finalSum;
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
