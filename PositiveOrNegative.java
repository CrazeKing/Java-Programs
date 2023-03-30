import java.util.Scanner;

public class PositiveOrNegative
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        
        int number = input.nextInt();
        
        //Checking the users input using if-else statement.
        if (number > 0) 
        {
            System.out.println("The number is positive.");
        } 
        else if (number < 0) 
        {
            System.out.println("The number is negative.");
        } 
        else 
        {
            System.out.println("The number is zero.");
        }
    }
}
