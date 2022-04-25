
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double average = 0;
        int oddNumbers = 0;
        int evenNumbers = 0;

        System.out.println("Type numbers:");
        while (true) {
            int userNumber = Integer.parseInt(reader.nextLine());

            if (userNumber == -1) {
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + sum);
                System.out.println("How many numbers: " + count);
                System.out.println("Average: " + average);
                System.out.println("Even numbers: " + evenNumbers);
                System.out.println("Odd numbers: " + oddNumbers);
                break;
            } else {

                sum += userNumber;
                count++;
                average = (double) sum / count;

                if (userNumber % 2 == 0) {

                    evenNumbers++;
                } else {

                    oddNumbers++;
                }
            }
        }
    }
}