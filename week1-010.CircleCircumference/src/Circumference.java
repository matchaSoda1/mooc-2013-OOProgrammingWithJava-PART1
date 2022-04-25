
import java.util.Scanner;
import java.math.*;

public class Circumference {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());
        
        double circumference = 2 * radius * Math.PI;
        
        System.out.println("Circumference of the circle: " + circumference);
        
    }
}
