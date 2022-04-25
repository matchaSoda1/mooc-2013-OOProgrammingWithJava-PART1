
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        while (true) {
        System.out.println("Type the password: ");
        
        
        //Exercise 22.1: Asking for the password
        
            String userPass = reader.nextLine();
            
            if (userPass.equals(password)){
                System.out.println("Right!");
                System.out.println("The secret is: chocolate");
                break;
            } else { 
                System.out.println("Wrong!");
            }
        }
        
    }
}
