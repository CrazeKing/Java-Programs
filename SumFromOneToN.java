import java.util.Scanner;

public class SumFromOneToN
{
  //Function Creation
    public static int sumOfIntegers(int n) 
    {
        int sum = 0;
        for (int i = 1; i <= n; i++) 
        {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
      
        //Taking Number from User
        System.out.print("Enter a Number: ");
        int n = input.nextInt();
      
        //Function Calling
        int sum = sumOfIntegers(n);
        System.out.println("The sum of all Integers from 1 to " + n + " is " + sum);
    }
}
