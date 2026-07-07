import java.util.Scanner;
public class finding_number{
    public static  boolean find_number(int array[],int num1,int targert)
{
       
        for(int i=0;i<num1;i++)
        {
            if(targert==array[i])
            {
                return true;
            }
        }
       
        return false;
    
}
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

        boolean result = find_number(array, num1,9);
        boolean Result=  find_number(array, num1,7);
        if (result==true) {
            System.out.println("The given number is present inside the array");
        } else {
            System.out.println("The given number is not present inside the array");
        }

    }
}
