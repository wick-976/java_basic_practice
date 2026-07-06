import java.util.Scanner;
public class finding_number {
    public static void main(String [] args)
    {
        int num1;
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        int array[]=new int [num1];

        for(int i=0;i<num1;i++)
        {
               array[i]=sc.nextInt();
        }

        for(int i=0;i<num1;i++)
        {
            if(num1==array[i])
            {
                System.out.println("The given number is present inside the array");
                return;
            }
        }
        System.out.println("THe given number is not present inside the array");

    }
}
