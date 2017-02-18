/**
 * Created by pandey on 10/02/17.
 * Created by pandeys on 8/29/2016.
 * The following iterative sequence is defined for the set of positive integers:

 n ? n/2 (n is even)
 n ? 3n + 1 (n is odd)

 Using the rule above and starting with 13, we generate the following sequence:

 13 ? 40 ? 20 ? 10 ? 5 ? 16 ? 8 ? 4 ? 2 ? 1
 It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

 Which starting number, under one million, produces the longest chain?
 */
public class eulerProblem14 {




        public static void main(String[] args) {
            long startTime = System.currentTimeMillis();
            long million = 1000000;
            int chainLength =0;
            int MaxChainLength =0;
            long finInt = 0;

            for(long i = million; i>1 ; i --) {
                chainLength = 1;
                long n = i;

                while (n !=1) {


                    if (n % 2 == 1) {
                        //process as odd 3n+1
                        n = 3*n + 1;
                        chainLength++;
                    } else {
                        //process even
                        n = n/2;
                        chainLength++;
                    }

                }

                //System.out.println( "No. elements in chain : " + chainLength +" for Int : " + i);
                if(MaxChainLength<chainLength)
                {
                    MaxChainLength = chainLength;
                    finInt = i;
                    //i++;
                }
            }

            long endTime   = System.currentTimeMillis();

            long totalTime = endTime - startTime;

            System.out.println( "Max elements in chain : " + MaxChainLength +" for Int : " + finInt +"\nTotal run time : "+totalTime);


        }

}
