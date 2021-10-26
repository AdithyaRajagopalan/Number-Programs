import java.util.* ;

public class BuzzNumber
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter a number to check whether it is a Buzz Number : ");
        int inputNum = sc.nextInt() ;
        if (inputNum%10 == 7 || inputNum%7 == 0)
        {
            System.out.println ("The given number is a Buzz Number .");
        }
        else
        {
            System.out.println ("The given number is not a Buzz Number .");
        }
    }
}