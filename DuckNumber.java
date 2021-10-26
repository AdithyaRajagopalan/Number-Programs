import java.util.*;

public class DuckNumber
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int inputNum,digit,ctr1,numLen;
        String inputAsString;
        System.out.print("Enter a number to check whether it is a Duck Number : ");
        inputNum = sc.nextInt();
        inputAsString = Integer.toString(inputNum);
        numLen = inputAsString.length();
        if (inputNum<0)
        {
            System.out.println("Negative values are invalid input.");
            System.exit(0);
        }
        if (inputNum==0)
        {
            System.out.println("0 is not a Duck Number as it starts with a leading 0.");
            System.exit(0);
        }
        for (ctr1 = 0 ; ctr1 <= (numLen-1) ; ctr1 ++)
        {
            if (inputAsString.charAt(ctr1) == '0')
            {
                System.out.println("Given number is a Duck Number .");
                System.exit(0);
            }
        }
        System.out.println("Given number is not a Duck Number .");
    }
}