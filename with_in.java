import java.util.Scanner;
public class with_in{
    public static void main(String [] main)
    {
        Scanner sc=new Scanner(System.in);
        int num1=1,num2=15;

        int result;

        result=sc.nextInt();

        if(num1<=result && result<=num2)
        {
             System.out.print("the given number is within the range of 1 to 15: "+result);
        }
        else
        {
            System.out.println("the given number is not within the range of 1 to 15: "+result);
        }

    }
}