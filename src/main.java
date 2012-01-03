import java.util.Scanner;

public class main {


	public static void main(String[] args) 
	{
		
		System.out.print("hello world\n");
		//easy output to console.
		//    /n = newline
		//----------------------------
		
	    String text;  //variable definition
	    int integer;  //-------------------
	    
	    
	    System.out.print("enter text..\n");
	    //prompt
	    Scanner in = new Scanner(System.in);
	    //scanner utility runs on input stream
	    text = in.nextLine();
	    //text is assigned the return value of in.nextline
	    System.out.print("you entered"+text+"\n");
	    //text is returned
	    
	    System.out.print("enter int\n");
	    integer=in.nextInt();
	    in.close();            
	    System.out.print("you entered"+integer+"\n");
	    //same setup as above w/int


	}

}
