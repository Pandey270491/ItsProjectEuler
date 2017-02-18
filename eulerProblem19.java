/**
 * Created by pandey on 11/02/17.
 */
public class eulerProblem19 {
    public static void main(String[] args) {
        int hitSunday = 0;
        boolean month = true;
        boolean year = true;
        int day = 0;
        boolean date = true;
        boolean maxDateForMonth = true;

        for(int var8 = 1900; var8 <= 2000; ++var8) {
            for(int var7 = 1; var7 <= 12; ++var7) {
                int var10 = getMaxDateForMonth(var7, var8);

                for(int var9 = 1; var9 <= var10; ++var9) {
                    if(day == 7) {
                        day = 1;
                    } else {
                        ++day;
                    }

                    if(var8 >= 1901 && day == 7 && var9 == 1) {
                        ++hitSunday;
                    }
                }
            }
        }

        System.out.println("No. of Sundays on 1st of a month between 1901 and 2000 are : " + hitSunday);
    }

    public static int getMaxDateForMonth(int month, int year) {
        byte maxDateForMonth;
        if(month == 2) {
            if(isLeapYear(year)) {
                maxDateForMonth = 29;
            } else {
                maxDateForMonth = 28;
            }
        } else if(month != 4 && month != 6 && month != 9 && month != 11) {
            maxDateForMonth = 31;
        } else {
            maxDateForMonth = 30;
        }

        return maxDateForMonth;
    }

    public static boolean isLeapYear(int year) {
        if(year % 100 == 0) {
            if(year % 400 == 0) {
                return true;
            }
        } else if(year % 4 == 0) {
            return true;
        }

        return false;
    }
}
