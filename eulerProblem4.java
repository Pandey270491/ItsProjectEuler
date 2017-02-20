/**
 * Created by pandey on 10/02/17.
 */
public class eulerProblem4 {
   public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int num1=999;
        int num2=0;
        int LargestNum1=0;
        int LargetsNum2=0;
        int LargestPallendrome=0;
        boolean pFound=false;

        while(num1>=100)
        {
            num2=999;
            while(num2>=100) {

                if (checkPallindrome(num1, num2)) {
                  int pNumber=num1*num2;
                    if(pNumber>LargestPallendrome)
                    {
                        LargestPallendrome=pNumber;
                        LargestNum1=num1;
                        LargetsNum2=num2;
                    }
                }
                num2--;
            }
            num1--;
        }
        System.out.println("largest palindrome " + LargestPallendrome + "= " +LargestNum1 + "*"+ LargetsNum2);
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");

    }

    public static boolean checkPallindrome(int n1, int n2)
    {
        int number=n1*n2;
        int constructReverse =0;
        int digit=0;

        while(number>0)
        {
            digit=number%10;
            constructReverse = constructReverse *10 + digit;
            number = number/10;
        }
        constructReverse = constructReverse +number;

        if(constructReverse==n1*n2)
        {
            return true;
        }

        return false;

    }
}
