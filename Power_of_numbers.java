import java.util.Scanner;
public class Power_of_numbers {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        num1=sc.nextInt();
        num2=sc.nextInt();
        
        int add=num1;

        for(int i=1;i<num2;i++)
        {  
            add=add*num1; 
            
        }
    
    System.out.println(add);
    }

}
  //3 3 