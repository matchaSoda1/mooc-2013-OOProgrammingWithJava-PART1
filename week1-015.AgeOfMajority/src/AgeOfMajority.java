
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("How old are you?");
        int age1 = Integer.parseInt(reader.nextLine());
        
        if (age1>17) {
            System.out.println("You have reached the age of majority!");
        }
        else{
            System.out.println("You have not reached the age of majority yet!");
        }
          
    }
}
