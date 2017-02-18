/**
 * Created by pandey on 11/02/17.
 */
public class eulerProblem17 {

    public static void main(String[] args) {
        long totalLetterCount = 0L;

        for(int i = 1; i <= 1000; ++i) {
            totalLetterCount += Long.valueOf(getLetterCountOfNumber(i)).longValue();
        }

        System.out.println("Total Letters used from 1 to 1000 are : " + totalLetterCount);
    }

    public static long getLetterCountOfNumber(int number) {
        String charNumberValue = "" + number;
        int lengthOfNum = charNumberValue.length();
        boolean lettersInNumber = false;
        String numberString = "";
        int hundredPlaceDigit;
        int tensPlaceDigit;
        String h_DigitString;
        switch(lengthOfNum) {
            case 1:
                numberString = getSingleDigitString(number);
                break;
            case 2:
                if(9 < number && number < 20) {
                    numberString = getStringFor10to19(number);
                } else {
                    hundredPlaceDigit = Integer.parseInt("" + charNumberValue.charAt(0));
                    tensPlaceDigit = Integer.parseInt("" + charNumberValue.charAt(1));
                    String onesPlaceDigit1 = getStringForTensDigit(hundredPlaceDigit);
                    h_DigitString = getSingleDigitString(tensPlaceDigit);
                    numberString = onesPlaceDigit1 + h_DigitString;
                }
                break;
            case 3:
                hundredPlaceDigit = Integer.parseInt("" + charNumberValue.charAt(0));
                tensPlaceDigit = Integer.parseInt("" + charNumberValue.charAt(1));
                int onesPlaceDigit = Integer.parseInt("" + charNumberValue.charAt(2));
                h_DigitString = getSingleDigitString(hundredPlaceDigit) + "HUNDRED";
                if(charNumberValue.endsWith("00")) {
                    numberString = h_DigitString;
                } else {
                    h_DigitString = getSingleDigitString(hundredPlaceDigit) + "HUNDREDAND";
                    if(9 < number % 100 && number % 100 < 20) {
                        numberString = getStringFor10to19(number % 100);
                    } else {
                        String tensDigitString = getStringForTensDigit(tensPlaceDigit);
                        String onesDigitString = getSingleDigitString(onesPlaceDigit);
                        numberString = tensDigitString + onesDigitString;
                    }

                    numberString = h_DigitString + numberString;
                }
                break;
            case 4:
                numberString = "ONETHOUSAND";
        }

        System.out.println(number + " --> " + numberString);
        int lettersInNumber1 = numberString.length();
        return (long)lettersInNumber1;
    }

    private static String getStringForTensDigit(int tensPlaceDigit) {
        String numberString = "";
        switch(tensPlaceDigit) {
            case 0:
                numberString = "";
                return numberString;
            case 1:
            default:
                break;
            case 2:
                numberString = "TWENTY";
                break;
            case 3:
                numberString = "THIRTY";
                break;
            case 4:
                numberString = "FORTY";
                break;
            case 5:
                numberString = "FIFTY";
                break;
            case 6:
                numberString = "SIXTY";
                break;
            case 7:
                numberString = "SEVENTY";
                break;
            case 8:
                numberString = "EIGHTY";
                break;
            case 9:
                numberString = "NINETY";
        }

        return numberString;
    }

    private static String getStringFor10to19(int number) {
        String numberString = "";
        switch(number) {
            case 10:
                numberString = "TEN";
                break;
            case 11:
                numberString = "ELEVEN";
                break;
            case 12:
                numberString = "TWELVE";
                break;
            case 13:
                numberString = "THIRTEEN";
                break;
            case 14:
                numberString = "FOURTEEN";
                break;
            case 15:
                numberString = "FIFTEEN";
                break;
            case 16:
                numberString = "SIXTEEN";
                break;
            case 17:
                numberString = "SEVENTEEN";
                break;
            case 18:
                numberString = "EIGHTEEN";
                break;
            case 19:
                numberString = "NINETEEN";
        }

        return numberString;
    }

    private static String getSingleDigitString(int number) {
        String numberString = "";
        switch(number) {
            case 0:
                numberString = "";
                break;
            case 1:
                numberString = "ONE";
                break;
            case 2:
                numberString = "TWO";
                break;
            case 3:
                numberString = "THREE";
                break;
            case 4:
                numberString = "FOUR";
                break;
            case 5:
                numberString = "FIVE";
                break;
            case 6:
                numberString = "SIX";
                break;
            case 7:
                numberString = "SEVEN";
                break;
            case 8:
                numberString = "EIGHT";
                break;
            case 9:
                numberString = "NINE";
        }

        return numberString;
    }
}
