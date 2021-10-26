import java.util.*;

public class GoldBachNumber
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int ctr1,ctr2,inputNum;
        System.out.print("Enter a number to check if its a Goldbach Number: ");
        inputNum=sc.nextInt();
        for(ctr1 = 2;ctr1<(inputNum-1);ctr1++)
        {
            if(isPrime(ctr1)==true)
            {
                for(ctr2=2;ctr2<(inputNum-1);ctr2++)
                {
                    if(isPrime(ctr2)==true)
                    {
                        if(inputNum==ctr1+ctr2)
                        {
                            System.out.println("Given number is GoldBach Number.");
                            System.exit(0);
                        }
                    }
                }
            }
        }
        System.out.println("Given number is not a GoldBach Number.");
    }
    public static boolean isPrime(int x)
    {
        int ctr1;
        for(ctr1=2;ctr1<x;ctr1++)
        {
            if(x%ctr1==0)
            {
                return false;
            }
        }
        return true;
    }
}