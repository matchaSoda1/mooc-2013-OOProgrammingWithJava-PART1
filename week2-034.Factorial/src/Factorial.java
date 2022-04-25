
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int usersNumber = Integer.parseInt(reader.nextLine());
        int factorial = 1;
        
        while (1 <= usersNumber) {

                factorial *= usersNumber;
                usersNumber--;
               
            }

            System.out.println("Factorial is " + factorial);
        }
    }
