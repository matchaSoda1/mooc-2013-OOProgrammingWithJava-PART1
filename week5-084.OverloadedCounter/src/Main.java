public class Main {
    public static void main(String[] args) {
        // write testcode here
        Counter myCounter = new Counter(1,false);

        myCounter.decrease();
        System.out.println("myCounter value: " + myCounter.value());
        myCounter.decrease();
        System.out.println("myCounter value: " + myCounter.value());
        myCounter.decrease();
        System.out.println("myCounter value: " + myCounter.value());
    }
}
