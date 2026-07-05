import java.util.Scanner;
public class primeornot {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int num1;
        num1=sc.nextInt();
        int count=0;

        for(int i=1;i<=num1;i++)
        {
            if(num1%i==0)
            {
                count++;
            }

        }

         if(count<=2)
            {
                System.out.println("prime");
            }
            else{
                System.out.println("not prime");
            }
    }
}
