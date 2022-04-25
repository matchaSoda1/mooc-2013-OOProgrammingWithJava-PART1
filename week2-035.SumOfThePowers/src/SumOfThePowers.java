
import java.util.Scanner;
import java.math.*;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int upperBound = Integer.parseInt(reader.nextLine());
        int lowerBound = 0;
        
        int powerNumber = 1;
        int sum = 0;

        while (lowerBound <= upperBound) {
            powerNumber = (int) Math.pow(2, lowerBound);
            System.out.println("power number is " + powerNumber);
            //returns double so have to convert to int
            sum += powerNumber;
            System.out.println("sum is " + sum);
            lowerBound++;
        }

        System.out.println("The result is " + sum);
    }
}
