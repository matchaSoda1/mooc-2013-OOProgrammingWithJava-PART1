import java.util.Random;

public class Dice {
    private Random random = new Random();
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int roll() {
        // create here a random number belonging to range 1-numberOfSides
        
        return this.random.nextInt(numberOfSides) +1; //returns random numbers up to n-1
    }// the +1 is to make the 0s into 1s
    
}
