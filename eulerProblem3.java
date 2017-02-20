/**
 * Created by pandey on 10/02/17.
 */
public class eulerProblem3 {

    public static void main(String[] args) {

        long number = 600851475143L;
        getLargestPrimeFactor(number);
    }

    public static void getLargestPrimeFactor(long number) {
        long largestPrimeFactor =0;

        while(number%2==0)
        {
            if(number==1)
            {
                largestPrimeFactor=2;
                System.out.println(largestPrimeFactor);
                break;
            }
           else{
                number =number/2;
            }

        }
        largestPrimeFactor=3;
        while(number!=1)
        {
            while (number % largestPrimeFactor == 0) {
                if (number == 1) {
                    System.out.println(largestPrimeFactor);
                    break;
                } else {
                    number = number / largestPrimeFactor;
                }
            }
            if(number==1)
            {
                System.out.println(largestPrimeFactor);
                break;
            }
            else
            {
                largestPrimeFactor+=2;
            }
        }
    }
}
