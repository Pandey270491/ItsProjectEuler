

import java.io.*;

import java.util.*;

/**
 * Created by pandey on 14/02/17.
 *Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.

 For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.

 What is the total of all the name scores in the file?
 */


public class eulerProblem22 {

//


    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        String location = "/Users/pandey/Downloads/p022_names.txt";

        List<String> nameArray = new ArrayList<String>();


        fetchAndReadFile(location, nameArray);
        Collections.sort(nameArray);

        calculateFinalScore(nameArray);

        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        System.out.println("Runtime for Problem 22 : " +totalTime );

    }

    public static void calculateFinalScore(List<String> nameArray) {
        int worthOfAName=0;
        long sumOfNameScores=0;
        List<Integer> worthOfNameList = new ArrayList<Integer>();
        for(String s : nameArray)
        {
            worthOfAName=0;

            for(char a : s.toCharArray())
            {
                worthOfAName+=charValueOfA(a);
            }
            worthOfNameList.add(worthOfAName);
        }

        for(int i = 1; i<=worthOfNameList.size() ; i++)
        {
            sumOfNameScores+=i* worthOfNameList.get(i-1);
        }



        System.out.println("Final Score : " +sumOfNameScores);
    }

    public static void fetchAndReadFile(String location, List<String> nameArray) {
        try
        {
            File file = new File(location);
            Scanner scanFile = new Scanner(file);

            while (scanFile.hasNext())
            {
                String Content = scanFile.useDelimiter(",").next();
                nameArray.add(Content);
            }
        }
        catch (Exception E)
        {
            System.out.println("EXCEPTION OCCURRED WHILE READING THE FILE!!");
        }


       // System.out.println(nameArray.size());
       // System.out.println(nameArray);
    }



    public static int charValueOfA (char a)
    {


        switch (a)
        {
            case 'A' : return 1;
            case 'B' : return 2;
            case 'C' : return 3;
            case 'D' : return 4;
            case 'E' : return 5;
            case 'F' : return 6;
            case 'G' : return 7;
            case 'H' : return 8;
            case 'I' : return 9;
            case 'J' : return 10;
            case 'K' : return 11;
            case 'L' : return 12;
            case 'M' : return 13;
            case 'N' : return 14;
            case 'O' : return 15;
            case 'P' : return 16;
            case 'Q' : return 17;
            case 'R' : return 18;
            case 'S' : return 19;
            case 'T' : return 20;
            case 'U' : return 21;
            case 'V' : return 22;
            case 'W' : return 23;
            case 'X' : return 24;
            case 'Y' : return 25;
            case 'Z' : return 26;

        }
        return 0;

        //alternative approach- same run time less readable intresting approach.
//        if(a=='\"')
//        {
//            return 0;
//        }
//        return (Integer.valueOf(a) -64);
    }
}
