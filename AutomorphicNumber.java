import java.util.*;

public class AutomorphicNumber
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int inputNum,inputLength,inputSqr;
        String inputAsString;
        System.out.print("Enter a number to check whether it is an Automorphic Number : ");
        inputNum = sc.nextInt();
        if (inputNum==0)
        {
            System.out.println("Zero is an Automorphic number.");
            System.exit(0);
        }
        if (inputNum < 0)
        {
            System.out.println("Negative number is invalid input.");
            System.exit(0);
        }
        inputAsString = Integer.toString(inputNum);
        inputLength=inputAsString.length();
        inputSqr = inputNum*inputNum;
        if ((inputSqr%(Math.pow(10,inputLength)))==inputNum)
        {
            System.out.println("Number is an Automorphic Number.");
        }
        else
        {
            System.out.println("Given number is not an Automorphic Number.");
        }
    }
}