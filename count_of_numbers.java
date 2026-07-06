import java.util.Scanner;
public class count_of_numbers{
    public static void main (String [] args)
    {
        int num1;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number to count the digits: ");
        num1=sc.nextInt();
        int count=0;
        while(num1!=0)
        {
             num1/=10;
             count++;
        }

    System.out.println("The count of digits is: "+count);
    }
}