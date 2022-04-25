
public class Main {

    public static void main(String[] args) {
        // test your code here

        Team barcelonaFC = new Team("FC Barcelona");
        System.out.println("Team: " + barcelonaFC.getName());
//        

        Player robert = new Player("Robert");
//         System.out.println("Player: " + dave);

        Player alice = new Player("Alice", 39);
//         System.out.println("Player: " + dork);
//         

        Player diana = new Player("Diana", 2);
        
        barcelonaFC.addPlayer(robert);
        barcelonaFC.addPlayer(alice);
        barcelonaFC.addPlayer(diana);
        barcelonaFC.printPlayers();
        System.out.println("Number of players: " + barcelonaFC.size());
        System.out.println("Total goals: " + barcelonaFC.goals());

    }
}
