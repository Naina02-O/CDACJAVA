import java.util.Scanner;

public class revstr{
	public static void reverseString(String str){
        String rstr="";
        char ch;
         for( int i=0;i<str.length();i++){
          ch = str.charAt(i);
          rstr = ch + rstr;
         }
		
		System.out.println("reverse string :"+ rstr);
    }	
	public static void main(String[] args) 
	{		
	    System.out.println("Enter a String:");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		reverseString(str);
		s.close();
		
	
	}

	
	
}
