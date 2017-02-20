/**
 * Created by pandey on 10/02/17.
 */
public class eulerProblem1 {
   public static void main(String[] args)
    {
        CheckAndAdd();
    }

    public static void CheckAndAdd() {
        long total=0;

        for( int i=1 ; i<1000 ; i ++) {
            if(i%3==0 || i%5==0)
            {
                total +=i;
            }

        }
        System.out.println(total);
    }
}
