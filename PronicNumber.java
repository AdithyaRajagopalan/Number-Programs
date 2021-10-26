import java.util.*;

public class PronicNumber
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int inputNum,factor,ctr1;
        System.out.print("Enter a number to check whether it is a Pronic Number : ");
        inputNum = sc.nextInt();
        for (ctr1 = 1;ctr1<=inputNum;ctr1++)
        {
            if (inputNum%ctr1==0)
            {
                if (ctr1*(ctr1+1)==inputNum || ctr1*(ctr1-1)==inputNum)
                {
                    System.out.println("Number is a Pronic Number.");
                    System.exit(0);
                }
            }
        }
        System.out.println("Number is not a Pronic Number.");
    }
}