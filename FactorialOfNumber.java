import java.util.*;

public class FactorialOfNumber
{
    public static void main(String [] args)
    {
        int inputNum,ctr1;
        long factorial=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial : ");
        inputNum=sc.nextInt();
        if (inputNum==1 || inputNum==0)
        {
            System.out.println("Factorial = 1");
            System.exit(0);
        }
        if (inputNum<0)
        {
            System.out.println("Factorial of a negative number does not exist.");
            System.exit(0);
        }
        for(ctr1 = 2 ; ctr1 < inputNum ; ctr1 ++)
        {
            factorial*=ctr1;
        }
        System.out.println("Factorial = "+factorial);
    }
}