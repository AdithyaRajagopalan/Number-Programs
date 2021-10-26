import java.util.*;

public class TechNumber
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int inputNum=0,numLength;
        double halfLen,secondHalf,firstHalf;
        String inputAsString;
        while (true)
        {
            try
            {
                System.out.print ("Enter a number to check whether it is a Tech Number : ");
                inputNum = sc.nextInt();
                if (inputNum ==0 || inputNum == 1)
                {
                    System.exit(0);
                }
                else
                {
                    inputAsString = Integer.toString(inputNum);
                    numLength = inputAsString.length();
                    if (numLength%2!=0)
                    {
                        System.out.println("Given number is not a Tech Number .");
                    }
                    else
                    {
                        halfLen = numLength/2;
                        secondHalf = inputNum%Math.pow(10,halfLen);
                        firstHalf = (inputNum-secondHalf)/Math.pow(10,halfLen);
                        if (((firstHalf+secondHalf)*(firstHalf+secondHalf))==inputNum)
                        {
                            System.out.println("Given number is a Tech Number .");
                        }
                        else
                        {
                            System.out.println("Given number is not a Tech Number .");
                        }
                        System.exit(0);
                    }
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Enter a valid number.");
                continue;
            }
        }
    }
}