import java.util.Scanner;

public class CalculatoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = sc.nextDouble();

        System.out.println("Enter the operator:");
         System.out.println("Addition = +");
          System.out.println("Subtraction = -");
           System.out.println("Multiplication = *");
            System.out.println("Division = /");
             System.out.println("Modulus = %");
              System.out.println("Exponential = ^");
               System.out.println("Percentage = P");
        
        char operator = sc.next().charAt(0);

        System.out.println("Enter the second number:");
        double num2 = sc.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("The result is: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("The result is: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("The result is: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The result is: " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
                case '%':
                    result = num1 % num2;
                    System.out.println("The result is: " + result);
                    break;
                case '^':
                    result = Math.pow(num1, num2);
                    System.out.println(num1 + " raised to the power of " + num2 + " is: " + result);
                    break;
                    
                case 'P':
                    result = num1 * (num2/100);
                    System.out.println(num2 + "percent of" + num1 + "is" + result);
            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
        }

        sc.close();
    }
}
