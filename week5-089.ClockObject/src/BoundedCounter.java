
public class BoundedCounter {

    // copy here the class BoundedCounter from last weeks assignment 78 
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void next() {
        if (this.value+1 <= this.upperLimit) {
            this.value++;
        } else {
            this.value = 0;
        }
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int val) {
        this.value = val;
    }

    public String toString() {
        String result = "" + this.value;
        
        if (this.value < 10) {
            return "0" + result;
        } 
            return result;
        
    }
}
