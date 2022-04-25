
public class Player {
    private String playerName;
    private int numberOfGoals;
    
    public Player(String pName, int goals) {
        this.playerName = pName;
        this.numberOfGoals = goals;
        
    }
    public Player(String pName) {
        this(pName,0);   
    }
    
    public String getName() {
        return this.playerName;
    }
    
    public int goals() {
        return this.numberOfGoals;
    }
    
    public String toString() { 
    return this.playerName + ", goals " + this.numberOfGoals;
}
}
