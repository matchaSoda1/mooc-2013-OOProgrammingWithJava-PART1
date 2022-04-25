      
public class Main {

    public static void main(String[] args) {
        NightSky sky = new NightSky(0.1,50,5);
        sky.print();
        sky.print();
        
        System.out.println(sky.starsInLastPrint());
        
    }
}
