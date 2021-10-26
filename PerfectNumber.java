import java.util.* ;

public class PerfectNumber
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter a number to check whether it is a Perfect Number .");
        int inputNum = sc.nextInt ();
        int ctr1 , divisorSum = 0 ;
        for (ctr1 = 1 ; ctr1 < inputNum ; ctr1 ++)
        {
            if(inputNum%ctr1==0)
            {
                divisorSum += ctr1 ;
            }
        }
        if (divisorSum == inputNum)
        {
            System.out.println ("The given number is a Perfect Number .");
        }
        else
        {
            System.out.println ("The given number is not a Perfect Number .");
        }
    }
}