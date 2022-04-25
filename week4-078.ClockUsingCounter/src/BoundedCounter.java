
public class BoundedCounter {

    private int value;
    private int upperBound;
    private int initValue;

    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperBound = upperLimit;

    }

    public void next() {
        this.value++;
        if (this.value > upperBound) {
            this.value = 0;
        }

    }

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        } else {
            return "" + this.value;
        }

    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        if (value <= this.upperBound && value >= 0) {
            this.value = value;
        }
    }
}
