public class Function 
{
    //Defining function
    public static int sum(int a, int b) 
    {
        int Total = a + b;
        return Total;
    }

    public static void main(String[] args) 
    {
        int num1 = 50;
        int num2 = 20;
        
        //Function calling and storing in result variable   
        int result = sum(num1, num2);
        
        //Printing final output
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}
