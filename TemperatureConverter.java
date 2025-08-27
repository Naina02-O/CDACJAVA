
import java.util.Scanner;
public class TemperatureConverter{
      

    public static void celsiusToFahrenheit(double c) {
        double f =(c * 9/5)+32;
        System.out.println("Temperature in Fahrenheit is "+f); 
    }
     public static void fahrenheitToCelsius(double f){
        double c =(f- 32)*5/9;
         System.out.println("Temperature in celcius is "+c); 
     }
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        System.out.println("1.celsiusToFahrenheit");
        System.out.println("2.fahrenheitToCelsius");
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
       
        switch(n){
            case 1:
            System.out.println("Enter a temperature in celsius :");
            double c = s.nextDouble();
            celsiusToFahrenheit(c);
            break;
            case 2:
            System.out.println("Enter a temperature in fahrenheit:");
            double f = s.nextDouble();
            fahrenheitToCelsius(f);
            break;
            default:
            System.out.println("invalid temperature");
        } 
        s.close();
    }
}