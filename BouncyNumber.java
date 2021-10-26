import java.util.*;

public class BouncyNumber
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String inputStr="",sortedStr="",reverseSortedStr="";
        char[] charsInStr;
        System.out.print("Enter a number to check if its bouncy : ");
        inputStr = sc.next();
        charsInStr = new char[inputStr.length()];
        for(int ctr1 = 0 ; ctr1 < inputStr.length() ; ctr1++)
        {
            charsInStr [ctr1] = inputStr.charAt(ctr1);
        }
        Arrays.sort(charsInStr);
        for(int ctr1 = 0 ; ctr1 < inputStr.length() ; ctr1++)
        {
            sortedStr += charsInStr[ctr1];
        }
        for(int ctr1 = 0 ; ctr1 < inputStr.length() ; ctr1++)
        {
            reverseSortedStr = charsInStr[ctr1]+reverseSortedStr;
        }
        if(sortedStr.equals(inputStr) || inputStr.equals(reverseSortedStr))
        {
            System.out.println("Given number is not a bouncy number.");
        }
        else
        {
            System.out.println("Given number is a bouncy number.");
        }
    }
}