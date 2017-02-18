/**
 * Created by pandey on 10/02/17.
 */
public class eulerProblem2 {
    public static void main(String[] args) {
        SumEvenFibonacci();
    }

    public static void SumEvenFibonacci() {
        long termPrev = 1L;
        long termCurrent = 2L;
        long termNext = 0L;
        long Sum = 2L;
        termNext = termPrev + termCurrent;

        do {
            if(termNext % 2L == 0L) {
                Sum += termNext;
            }

            termPrev = termCurrent;
            termCurrent = termNext;
            termNext += termPrev;
        } while(termNext <= 4000000L);

        System.out.println(Sum);
    }
}
