import java.util.Scanner;
public class Reverse(){
    public static void reverseDigits(int num){
    int digit=0;
		while(num !=0 )
		{
			
          digit = num%10;
          num = num/10;
          
	      		
			
		}
		System.out.println(num);
    } 
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
		int num;
		num = s.nextInt();
    }
}