
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the points: ");
        int examPoints = Integer.parseInt(reader.nextLine());

        // Create conversion table (long list of elif's!)
        if (examPoints >= 0 && examPoints < 30) {
            System.out.println("failed");
        } else if (examPoints >= 30 && examPoints < 35) {
            System.out.println("1");
        } else if (examPoints >= 35 && examPoints < 40) {
            System.out.println("2");
        } else if (examPoints >= 40 && examPoints < 45) {
            System.out.println("3");
        } else if (examPoints >= 45 && examPoints < 50) {
            System.out.println("4");
        } else if (examPoints >= 50 && examPoints < 60) {
            System.out.println("5");
        }
    }
}
