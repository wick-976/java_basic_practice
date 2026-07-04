import java.util.Scanner;
public class odd_even {
    public static void main(String[] args)
{
       int num;
       Scanner sc =new Scanner(System.in);
       num=sc.nextInt();

       if(num%2==0)
       {
        System.out.println("the given number is Even: "+num);
       }
       else
       {
        System.out.println("the given number is Odd: "+num);
       }
}}