
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Until what? ");
        int userNumber = Integer.parseInt(reader.nextLine());

        int stepNumber = 1;
        int sum = 0;

        while (stepNumber <= userNumber) {

//            System.out.println("Step number: " + stepNumber);
            sum += stepNumber;
//            System.out.println("Sum is " + sum);

            stepNumber++;

        }
        System.out.println("Sum is " + sum);
    }
}
