import java.util.*;

public class NivenOrHarshadNumber
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int inputNum,ctr1,digit,sumOfDigits=0,inputLength;
        String inputAsString;
        System.out.print("Enter a number to check whether it is a Niven (Harshad) Number.");
        inputNum = sc.nextInt();
        inputAsString = Integer.toString(inputNum);
        inputLength = inputAsString.length();
        for (ctr1 = 0;ctr1<(inputLength);ctr1++)
        {
            digit = ((int)inputAsString.charAt(ctr1))-48;
            sumOfDigits+=digit;
        }
        if (inputNum%sumOfDigits == 0)
        {
            System.out.println("Given number is a Niven Number.");
        }
        else
        {
            System.out.println("Given number is not a Niven Number .");
        }
    }
}