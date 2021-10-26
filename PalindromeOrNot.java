import java.util.* ;

public class PalindromeOrNot
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in) ;
        int ctr1;
        String inputNum , reverseNum = "";
        System.out.print ("Enter a number to check whether it is a palindrome : ");
        inputNum = scan.next() ;
        for (ctr1 = (inputNum.length()-1) ; ctr1 > (-1) ; ctr1 --)
        {
            reverseNum += inputNum.charAt(ctr1);
        }
        if (inputNum.equals(reverseNum) == true)
        {
            System.out.println ("The number is a palindrome .");
        }
        else
        {
            System.out.println ("the number is not a palindrome .");
        }
    }
}