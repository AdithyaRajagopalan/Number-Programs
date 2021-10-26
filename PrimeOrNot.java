import java.util.*;
//Program to check whether given number is prime or not
class PrimeOrNot 
{
    public static void main(String[] args)
    {
          int inputNumber;
          boolean primeOrNot = true;
          Scanner sc = new Scanner(System.in);
          System.out.print ("Enter a number to check whther given number is a prime : ");
          inputNumber = sc.nextInt();
          if (inputNumber == 1)
          {
              System.out.println("1 is neither prime nor composite.");
              System.exit(0);
          }
          if(inputNumber <= 0)
          {
              System.out.println("0 and negative numbers are invalid inputs.");
          }
          for (int ctr1 = 2;ctr1<inputNumber;ctr1++)
          {
              if (inputNumber%ctr1 == 0)
              {
                  primeOrNot = false;
                  break;
              }
          }
          if(primeOrNot)
          {
              System.out.println("Given number is a prime number.");
          }
          else
          {
              System.out.println("Given number is a composite number.");
          }
    }
}