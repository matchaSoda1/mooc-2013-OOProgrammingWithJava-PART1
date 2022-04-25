
public class Main {

    public static void main(String[] args) {
        Money a = new Money (10,20);
        Money b = new Money (8,50);
        Money c = a.minus(b);
        
        System.out.println(c);
        
    }
}
