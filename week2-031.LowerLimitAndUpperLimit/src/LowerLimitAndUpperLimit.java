
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int lowerBound = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int upperBound = Integer.parseInt(reader.nextLine());

        while (lowerBound <= upperBound) {
            System.out.println(lowerBound);
            lowerBound++;
        }
    }
}
