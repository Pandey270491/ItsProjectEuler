/**
 * Created by pandey on 10/02/17.
 */
public class eulerProblem6{

        public static void main(String[] args) {
            byte n = 100;
            long squareOfSum = (long)(n * (n + 1) / 2 * (n * (n + 1) / 2));
            long SumOfSquare = 0L;

            for(int i = 1; i <= 100; ++i) {
                SumOfSquare += (long)(i * i);
            }

            System.out.println("difference is " + squareOfSum + "-" + SumOfSquare + " = " + (squareOfSum - SumOfSquare));
        }
}
