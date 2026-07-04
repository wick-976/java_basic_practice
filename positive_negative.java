import java.util.Scanner;
public class positive_negative {
    public static void main(String [] args) 
    {
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();

        if(num>0)
        {
            System.out.println("the given number is Positive: "+num);
        }
        else if(num<0)
        {
            System.out.println("the given number is Negative: "+num);
        }
        else
        {
            System.out.println("the given number is Zero: "+num);
        }
    }
}
