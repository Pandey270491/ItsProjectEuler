/**
 * Created by pandey on 11/02/17.
 */
public class eulerProblem7 {
    public static void main(String[] args) {
        int pos = 0;
        int number = 1;

        while(pos <= 10000) {
            ++number;
            int factor = 0;

            for(int i = 1; i <= number; ++i) {
                if(number % i == 0) {
                    ++factor;
                }
            }

            if(factor == 2) {
                ++pos;
            }
        }

        System.out.println(number);
    }
}
