import java.util.*;

public class FibonacciSeries
{
    public static void main(String[] args)
    {
        System.out.println("The fibonacci series upto 20 digits is : ");
        int num1 = 1;
        int num2 = 1;
        int num3 = 0;
        System.out.println(num1);
        for (int ctr1 = 2;ctr1<20;ctr1++)
        {
            System.out.println(num2);
            num3=num2;
            num2+=num1;
            num1=num3;
        }
    }
}