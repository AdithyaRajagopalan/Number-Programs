import java.util.*;

public class OddOrEvenNumber
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        long inputNum;
        System.out.print("Enter a number to check if its odd or even : ");
        inputNum = sc.nextLong();
        if(inputNum%2==0)
        {
            System.out.println("Given number is even.");
        }
        else
        {
            System.out.println("Given number is odd.");
        }
    }
}