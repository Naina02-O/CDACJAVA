import java.util.Scanner;

class LoginPage {
    public static void main(String[] args) {
        String username = "yadavnaina";
        String password = "Naina@123";

        Scanner page = new Scanner(System.in);

        System.out.print("Enter username: ");
        String inputUsername = page.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = page.nextLine();

        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login Successful");
        } 
        else if (!inputUsername.equals(username) && !inputPassword.equals(password)) {
            System.out.println(" username and password are incorrect");
        } 
        else if (!inputUsername.equals(username)) {
            System.out.println("Please type the correct username");
        } 
        else {
            System.out.println("Wrong password");
        }

        page.close(); 
    } 
}
