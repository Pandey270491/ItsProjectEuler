/**
 * Created by pandey on 10/02/17.
 */
public class eulerProblem3 {

    public static void main(String[] args) {
        long number = 600851475143L;
        getLargestPrimeFactor(number);
    }

    public static void getLargestPrimeFactor(long number) {
        long largestPrimeFactor;
        for(largestPrimeFactor = 0L; number % 2L == 0L; number /= 2L) {
            if(number == 1L) {
                largestPrimeFactor = 2L;
                System.out.println(largestPrimeFactor);
                break;
            }
        }

        for(largestPrimeFactor = 3L; number != 1L; largestPrimeFactor += 2L) {
            while(number % largestPrimeFactor == 0L) {
                if(number == 1L) {
                    System.out.println(largestPrimeFactor);
                    break;
                }

                number /= largestPrimeFactor;
            }

            if(number == 1L) {
                System.out.println(largestPrimeFactor);
                break;
            }
        }

    }
}
