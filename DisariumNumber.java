import java.util.*;

public class DisariumNumber
{
    public static void main(String [] args)
    {
        int sumOfDigPow=0,digit,inputNum,strLen,ctr1;
        String inputAsString;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check whether it is a Disarium Number : ");
        inputNum=sc.nextInt();
        inputAsString = Integer.toString(inputNum);
        strLen = inputAsString.length();
        if (inputNum <= 0)
        {
            System.out.println("Invalid input.");
            System.exit(0);
        }
        for(ctr1=0;ctr1<=(strLen-1);ctr1++)
        {
            digit = ((int)(inputAsString.charAt(ctr1))-48);
            System.out.println(digit);
            sumOfDigPow += Math.pow(digit,(ctr1+1));
        }
        if (sumOfDigPow == inputNum)
        {
            System.out.println("Given number is a Disarium Number.");
        }
        else
        {
            System.out.println("Given number is not a Disarium Number.");            
        }
    }
}