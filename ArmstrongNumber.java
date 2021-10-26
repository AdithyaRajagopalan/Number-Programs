import java.util.*;

public class ArmstrongNumber
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int inputNum, noOfDigits, currentDig;
        double sumOfDig=0;
        String inputNumStr;
        System.out.print("Enter a number to check if its an Armstrong Number : ");
        inputNum = sc.nextInt();
        inputNumStr=Integer.toString(inputNum);
        noOfDigits=inputNumStr.length();
        for(int ctr=0;ctr<noOfDigits;ctr++)
        {
            currentDig = Integer.parseInt(Character.toString(inputNumStr.charAt(ctr)));
            sumOfDig += Math.pow(currentDig,3);
        }
        if(sumOfDig==inputNum)
        {
            System.out.println("Given number is an Armstrong Number.");
        }
        else
        {
            System.out.println("Given number is not an Armstrong Number.");
        }
    }
}