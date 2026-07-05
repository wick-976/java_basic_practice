import java.util.Scanner;
public class Multiplication_number {
    public static void main(String [] args)
    {
        int num1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print the multiplication table: ");5
        num1=sc.nextInt();
        
        for(int i=1;i<=10;i++)
        {
             System.out.println(""+num1+"*"+i+"="+(num1*i));
        }
    }
}
