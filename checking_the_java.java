import java.util.Scanner;
public class checking_the_java {

    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
         char ch=sc.next().charAt(0);
        if(ch>='a' && ch<='z'||ch>='A'&& ch<='Z')
        {
            System.out.println("the given character is an alphabet: "+ch);
        }
        else if(ch>='0' && ch<='9')
        {
            System.out.println("the given character is a number: "+ch);
        }
        else
        {
            System.out.println("the given character is not an alphabet or number: "+ch);
        }

    }

}