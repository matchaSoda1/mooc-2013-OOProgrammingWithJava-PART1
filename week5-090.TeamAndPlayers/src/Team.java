
import java.util.*;

public class Team {

    private String teamName;
    private ArrayList<Player> teamPlayers = new ArrayList<Player>();
    private int teamSize;

    public Team(String tName) {
        this.teamName = tName;
        this.teamSize = 16;
    }

    public String getName() {
        return teamName;
    }

    public void addPlayer(Player p1) {
        if (teamPlayers.size() < teamSize) {
            teamPlayers.add(p1);
        }
    }

    public void printPlayers() {

        for (Player p : teamPlayers) {
            System.out.println(p);
        }
    }

    public void setMaxSize(int size) {
        this.teamSize = size;
    }
    
    public int size() {
        return teamPlayers.size();
    }
    public int goals() {
        int teamTotalGoals = 0;
        for (Player p : teamPlayers) {
            teamTotalGoals+=p.goals();
        }
        return teamTotalGoals;
    }
}
