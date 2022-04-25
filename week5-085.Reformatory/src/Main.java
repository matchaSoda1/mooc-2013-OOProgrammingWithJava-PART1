
public class Main {

    public static void main(String[] args) {
        // write test code here
        Reformatory nottsReformatory = new Reformatory();
        
        Person brian = new Person ("Brian", 1, 110,7);
        Person david = new Person("David", 32, 176, 85);
        
        System.out.println(brian.getName() + "'s weight: " + nottsReformatory.weight(brian)+ " kg's");
        System.out.println(david.getName() + "'s weight: " + nottsReformatory.weight(david)+ " kg's");
    
//        nottsReformatory.feed(brian);
//        nottsReformatory.feed(brian);
//        nottsReformatory.feed(brian);
        
        nottsReformatory.weight(brian);
        nottsReformatory.weight(brian);
        nottsReformatory.weight(brian);
        nottsReformatory.weight(brian);
        
        System.out.println("");
        
        System.out.println(brian.getName() + "'s weight: " + nottsReformatory.weight(brian)+ " kg's");
        System.out.println(dave.getName() + "'s weight: " + nottsReformatory.weight(david)+ " kg's");
        System.out.println("total times weight has been measured: " + nottsReformatory.totalWeightsMeasured());
    }
}
