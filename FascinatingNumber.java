import java.util.*;

public class FascinatingNumber
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int ctr1,ctr2,inputNum,productW2,productW3,lengthOfFinalNum;
        String concatProducts;
        System.out.print("Enter a number to check if its fascinating: ");
        inputNum = sc.nextInt();
        productW2=inputNum*2;
        productW3=inputNum*3;
        concatProducts=Integer.toString(productW2)+Integer.toString(productW3);
        lengthOfFinalNum = concatProducts.length();
        for(ctr1=0;ctr1<lengthOfFinalNum;ctr1++)
        {
            for(ctr2=(ctr1+1);ctr2<ctr1;ctr2++)
            {
                if(concatProducts.charAt(ctr1)==concatProducts.charAt(ctr2))
                {
                    System.out.println("The number is not Fascinating.");
                    System.exit(0);
                }
            }
        }
        System.out.println("Given number is a Fascinating Number.");
    }
}