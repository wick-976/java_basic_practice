import java.util.Scanner;

class Book{
    String name;
    int page;
    String author;
    int cur_page;
    
    public void next_page()
    {
        cur_page++;
    }
    
}
    
public class object
{
	public static void main(String[] args) {
	    
	    Book dsabook=new Book();
	    
	    
	    dsabook.name="Tharan";
	    dsabook.page=1;
	    dsabook.author="Tharan Chinnadurai";
	    dsabook.cur_page=1;
	    System.out.print(dsabook.name+"\n");
	    System.out.println(dsabook.author);
	    System.out.println(dsabook.cur_page);
	    
	    dsabook.next_page();
	    System.out.println(dsabook.cur_page);
	    
	    
	    Book mathbook = new Book();
	    
	    mathbook.name="vivek";
	    mathbook.page=1;
	    mathbook.author="Jeeva prakash";
	    mathbook.cur_page=1;
	    System.out.println(mathbook.name);
	    System.out.println(mathbook.author);
	    mathbook.next_page();
	    System.out.println(mathbook.cur_page);
	
	}
}