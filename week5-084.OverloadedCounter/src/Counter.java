
public class Counter {

    private int value;
    private boolean check;

    //create constructors
    public Counter() {
        this(0, false); // uses the Counter(int initValue, boolean check constructor)
        // where initValue is 0 and the boolean are set to false by default
        // plus avoids copy-paste programming, it's good practise and overall it's easier and nicer to read
    }

    public Counter(int initialValue) {
        this(initialValue, false); //see notes above
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter(int initialValue, boolean check) {
        this.value = initialValue;
        this.check = check;
    }

    //create methods
    public int value() {
        return this.value;
    }

    public void increase() {
        this.increase(1); //same thing as constructors above
        // this uses the below method but plugs in 1 as the default amount
    }

    public void increase(int amount) {
        if (amount >= 0) {
            this.value += amount;
        }
    }

    public void decrease() {
        this.decrease(1); //same thing as constructors above 
        // this uses the below method but plugs in 1 as the default amount
    }

    public void decrease(int amount) {
        if (amount >= 0) {
            if (check == true && this.value - amount < 0) {
                this.value=0;
            } else {
                this.value -= amount;
            }
        }
    }
}
