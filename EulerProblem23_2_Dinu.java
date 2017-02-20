package ProjectEuler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by pandeys on 2/20/2017.
 */
public class EulerProblem23_2_Dinu {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        int maxLimit = 28124;


        List<Integer> abundantArrayList = new ArrayList<>();


        populateAbundantNumbersInList(maxLimit, abundantArrayList);

        Set<Integer> abundantNumberSums = generateNumbersWhichAreSumOfAbundantNumbers(abundantArrayList);

        int finalSum = 0;

        for(int i = 0; i < maxLimit; i ++){
            if (abundantNumberSums.contains(i)){
                continue;
            }
            else{
                finalSum += i;
            }
        }
        System.out.println("Final sum of positive numbers which cannot be represented as sum of two abundant numbers is  : " + finalSum);

        long endTime = System.currentTimeMillis();
        System.out.println("Runtime for Problem 23 : " + (endTime - startTime));
    }

    private static Set<Integer> generateNumbersWhichAreSumOfAbundantNumbers(List<Integer> abundantArrayList) {
        /*Instead of checking which are non abundant and perfect, we can just sum up each of the abundant number that we already generated and
        get all the numbers that are a sum of 2 abundant numbers. I used a Set instead of a List to avoid duplicates.

         */

        Set<Integer> numbersSumOfAbundant = new HashSet<>();

        for(int i = 0; i < abundantArrayList.size() - 1; i++){
            for (int j = i; j < abundantArrayList.size(); j++) {
                Integer sumOfAbundantNumbers = abundantArrayList.get(i) + abundantArrayList.get(j);
                numbersSumOfAbundant.add(sumOfAbundantNumbers);
            }
        }

        return numbersSumOfAbundant;
    }


    public static int getFinalSum(int maxLimit, List<Integer> abundantArrayList) {
        //int sum = 0;
        List<Integer> sum = new ArrayList<>();
        for (int num = 1; num <= maxLimit; num ++) {

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

    public static void populateAbundantNumbersInList(int maxLimit, List<Integer> list) {

        long startTime = System.currentTimeMillis();

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

        long endTime = System.currentTimeMillis();
        System.out.println("Runtime for Abundant Number generation: " + (endTime - startTime));
    }
}
