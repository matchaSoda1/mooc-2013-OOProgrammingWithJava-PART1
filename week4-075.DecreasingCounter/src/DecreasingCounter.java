
public class DecreasingCounter {

    private int value;  // instance variable that remembers the value of the counter
    private int initialValue;
    
    public DecreasingCounter(int startingValue) {
        this.value = startingValue;
        this.initialValue = startingValue;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        // write here code to decrease counter value by one
        if (this.value != 0) {
            this.value--;
        }

        // and here the rest of the methods
    }
    public void reset() {
        this.value = 0;
    }
    public void setInitial() {
        this.value = initialValue;
    }
}
