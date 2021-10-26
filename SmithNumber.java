import java.util.*;

public class SmithNumber
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int sumOfDig=0,inputNum,sumOfPF=0,inputLen,factor,sumOfFD=0;
        String inStr,factStr;
        System.out.print("Enter a number to check if its a Smith Number : ");
        inputNum=sc.nextInt();
        inStr=Integer.toString(inputNum);
        inputLen=inStr.length();
        for(int ctr=0;ctr<inputLen;ctr++)
        {
            sumOfDig+=Integer.parseInt(Character.toString(inStr.charAt(ctr)));
        }
        for(int ctr=2;ctr<inputNum;ctr++)
        {
            if(inputNum%ctr==0&&isPrime(ctr)==true)
            {
                factor=ctr;
                factStr=Integer.toString(factor);
                for(int ctr1=0;ctr1<factStr.length();ctr1++)
                {
                    sumOfFD+=Integer.parseInt(Character.toString(factStr.charAt(ctr1)));
                }
            }
        }
        if(sumOfFD==sumOfDig)
        {
            System.out.println("Given number is a Smith Number. Did you know it is also called a Joke Number?!");
        }
        else
        {
            System.out.println("Given number is not a Smith Number.");
        }
    }
    public static boolean isPrime(int n)
    {
        for(int ctr = 2;ctr < n; ctr++)
        {
            if(n%ctr==0)
            {
                return false;
            }
        }
        return true;
    }
}