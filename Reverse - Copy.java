import java.util.Scanner;

public class Reverse{
	public static void reverseDigits(int num){
         int r =0;
		while(num!=0 )
		{
           int digit = num%10;
          r = r*10 + digit;
          num = num/10;	
		}
		System.out.println("reversed number :"+ r);
    }	
	public static void main(String[] args) 
	{		
	    System.out.println("Enter a digit:");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		reverseDigits(num);
		s.close();
		
	
	}

	
	
}
