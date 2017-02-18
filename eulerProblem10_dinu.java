import java.util.ArrayList;
import java.util.List;

/**
 * Created by pandey on 11/02/17.
 */
public class eulerProblem10_dinu {
    public static void main(String[] args) {
        int maxNumber = 2000000;
        System.out.println("Printing sum of prime numbers from 1 to "+ maxNumber);
        long startTime = System.currentTimeMillis();
        long sumOfPrimes = sumPrime(maxNumber);
        long duration = System.currentTimeMillis() - startTime;
        System.out.println("Sum of primes under " + maxNumber + ": "+ sumOfPrimes);
        System.out.println("Duration: "+ duration);

    }

    private static long sumPrime(int maxPrimeUnder) {
        List<Long> primes = new ArrayList<>();
        primes.add(2L);
        primes.add(3L);
        long sumOfPrimes = 5;

        /*
        We make use of the property that any composite number has to be divisible by a prime.
        then next option (assuming we increment by 2 always - no point evaluating even numbers)
         ====================================
         Option 5:
            is divisible by 2 --> No
            is divisible by 3 --> No
            Add to prime

         Option 7:
            is divisible by 2 --> No
            is divisible by 3 --> No
            is divisible by 5 --> No
            Add to prime

         Option 9:
            is divisible by 2 --> No
            is divisible by 3 --> Yes
            Skip

         Option 11:
            is divisible by 2 --> No
            is divisible by 3 --> No
            is divisible by 5 --> No
            is divisible by 7 --> No
            Add to prime

         */

        for(long candidate=5; candidate < maxPrimeUnder; candidate+=2) {
            boolean isPrime = true;

            /*
            We need not check whether the candidate is divisible by all the primes lesser than it.
            Using the property that if a number is divisible then at least one of its factors has to
            be less than its square root, we can safely check for divisibility only till primes less than
            or equal to the sqr. root of the candidate
             */
            long maxPrimeDivisor = (long) Math.sqrt((double)candidate);

            for (long prime : primes) {
                if (candidate % prime == 0) {
                    isPrime = false;
                    break;
                }
                if(prime > maxPrimeDivisor){
                    break;
                }
            }

            if (isPrime) {
                primes.add(candidate);
                sumOfPrimes += candidate;
            }
        }
        return sumOfPrimes;
    }
}
