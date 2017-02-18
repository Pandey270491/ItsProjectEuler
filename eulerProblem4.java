/**
 * Created by pandey on 10/02/17.
 */
public class eulerProblem4 {
    public static void main(String[] args) {
        int num1 = 999;
        boolean num2 = false;
        int LargestNum1 = 0;
        int LargetsNum2 = 0;
        int LargestPallendrome = 0;

        for(boolean pFound = false; num1 >= 100; --num1) {
            for(int var8 = 999; var8 >= 100; --var8) {
                if(checkPallindrome(num1, var8)) {
                    int pNumber = num1 * var8;
                    if(pNumber > LargestPallendrome) {
                        LargestPallendrome = pNumber;
                        LargestNum1 = num1;
                        LargetsNum2 = var8;
                    }
                }
            }
        }

        System.out.println("largest palindrome " + LargestPallendrome + "= " + LargestNum1 + "*" + LargetsNum2);
    }

    public static boolean checkPallindrome(int n1, int n2) {
        int number = n1 * n2;
        int constructReverse = 0;

        for(boolean digit = false; number > 0; number /= 10) {
            int digit1 = number % 10;
            constructReverse = constructReverse * 10 + digit1;
        }

        constructReverse += number;
        return constructReverse == n1 * n2;
    }
}
