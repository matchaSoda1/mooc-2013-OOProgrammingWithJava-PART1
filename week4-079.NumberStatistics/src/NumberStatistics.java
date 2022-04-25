
import java.util.ArrayList;

public class NumberStatistics {
    //This one is poorly explained. 
    //The explanation for the class should just be,
    //the class only needs to remember how many numbers have been put in.

    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;

    }

    public void addNumber(int number) {
        amountOfNumbers++;
        sum += number;
    }

    public int amountOfNumbers() {
        return amountOfNumbers;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (amountOfNumbers == 0) {
            return 0;
        } else {
            return (double) this.sum / amountOfNumbers;
        }
    }
}
