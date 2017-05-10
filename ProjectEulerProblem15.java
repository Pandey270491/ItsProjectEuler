import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by shraddha.pandey on 5/9/2017.
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
 * there are exactly 6 routes to the bottom right corner.
 * How many such routes are there through a 20×20 grid?
 */
public class ProjectEulerProblem15 {

    public static void main(String[] args) {

        int rowDim = 20;
        int columnDim = 20;

        long[][] nodesScore = new long[rowDim+1][columnDim+1];

        for (int i = 0; i<=rowDim ; i++ )
        {
            for(int j = 0 ; j<=columnDim ; j++)
            {
                if((i ==0) || (j == 0))
                {
                   nodesScore[i][j] = 1;
                }
                else
                {
                    nodesScore[i][j] = nodesScore[i-1][j] + nodesScore[i][j-1];
                }
            }
        }

       // printMyArray(rowDim, columnDim, nodesScore);
        System.out.println(nodesScore[rowDim][columnDim]);




    }

    private static void printMyArray(int rowDim, int columnDim, long[][] nodesScore) {
        for (int i = 0; i<=rowDim ; i++ )
        {
            String row = "";

            for(int j = 0 ; j<=columnDim ; j++)
            {
                row +=" " + nodesScore[i][j];

            }

            System.out.println(row);

        }
    }
}
