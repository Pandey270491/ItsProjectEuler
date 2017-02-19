import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by pandey on 18/02/17.
 * A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4.
 * If all of the permutations are listed numerically or alphabetically, we call it lexicographic order.
 * The lexicographic permutations of 0, 1 and 2 are:

 012   021   102   120   201   210

 *What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
 */
public class EulerProblem24 {
    public static void main(String[] args) {

        int[] numArray = {0,1,2,3};
        int million = 1000000;
        //int[] numArray = {0,1,2,3,4,5,6,7,8,9};

        boolean foundMillionth = false;

        ArrayList<Integer> numList = new ArrayList<Integer>();
        ArrayList<Integer> tmpList = new ArrayList<Integer>(numList);
        ArrayList<String> permutaionsList = new ArrayList<String>();

        for(int i:numArray)
        {
            numList.add(i);
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i<numArray.length; i++) {

            int tmp = numArray[i];

            sb.append(tmp);

            numList.remove((Integer) tmp);

            System.out.println("Num List : " + numList);

            int pos = 0 ;

           for (int j:numList)
           {
               tmpList.add((Integer) j);
           }

            while(true){

                for (int j : tmpList) {
                    sb.append(j);
                }
                if(pos==tmpList.size())
                {
                    break;
                }
                if(pos<tmpList.size())
                {
                    int tmp1 = tmpList.get(pos);
                    tmpList.remove((Integer)tmp1);
                    tmpList.add((Integer) tmp1);
                    pos++;
                }
                                                                                                                                                                                                                                                            
                permutaionsList.add(sb.toString());
                sb.delete(1, sb.length());
                if(permutaionsList.size()==million)
                {
                    foundMillionth=true;
                    break;
                }
            }

            if(foundMillionth)
            {
                break;
            }

            sb.delete(0,sb.length());

            numList.add((Integer) tmp);
            tmpList.clear();

        }

        //Collections.sort(permutaionsList);

        System.out.println("All possible Permutations are : "+permutaionsList+"\nTotal Number : "+permutaionsList.size());

    }

}
