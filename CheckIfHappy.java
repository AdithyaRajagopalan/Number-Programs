import java.util.*;

public class CheckIfHappy
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int inputNum,newNum=0;
        String inpStr;
        System.out.print("Enter a number to check if its Happy : ");
        inputNum = sc.nextInt();
        inpStr=Integer.toString(inputNum);
        for(int ctr=1;ctr<1001;ctr++)
        {
            for(int ctr2=0;ctr2<inpStr.length();ctr2++)
            {
                newNum+=Math.pow(Integer.parseInt(Character.toString(inpStr.charAt(ctr2))),2);
            }
            if(newNum==1)
            {
                System.out.println("Given number is a Happy Number.");
                System.exit(0);
            }
            inpStr=Integer.toString(newNum);
            newNum=0;
        }
        System.out.println("Given number is an Unhappy Number.");
    }
}