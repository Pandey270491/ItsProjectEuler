/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

 What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * Created by pandey on 10/02/17.
 */
public class eulerProblem5 {
    public static void main(String[] args) {
        int ReqNumber = 20;

        while(true) {
            int divisibleCount = 0;

            for(int i = 1; i <= 20 && ReqNumber % i == 0; i++) {
                ++divisibleCount;
            }

            if(divisibleCount == 10) {
                System.out.println(ReqNumber);
                return;
            }

            ++ReqNumber;
        }
    }
}
