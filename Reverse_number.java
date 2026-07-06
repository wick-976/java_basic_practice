import java.util.Scanner;
public class Reverse_number {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);

        int num1;
        System.out.println("Enter the number to reverse: ");
        num1=sc.nextInt();
        int reverse=0;
        while(num1!=0)
        {
            int digit=num1%10;
            reverse=reverse*10+digit;
            num1/=10;
        }
        System.out.println("The reversed number is: "+reverse);
    }
}   
