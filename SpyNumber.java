import java.util.* ;

public class SpyNumber
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.print ("Enter a number to check whether it is a Spy Number : ");
        int inputNum = sc.nextInt () ;
        int currentNum = inputNum , currentDigit , digitSum = 0 , digitProduct = 1;
        while (currentNum > 0)
        {
            currentDigit = currentNum % 10;
            digitSum += currentDigit;
            digitProduct *= currentDigit;
            currentNum /= 10;
        }
        if (digitSum == digitProduct)
        {
            System.out.println ("The given number is a Spy Number .");
        }
        else
        {
            System.out.println ("The given number is not a Spy Number .");
        }
    }
}