
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {

        //print top ten players based on goals
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        //print top 25 players based on penalty amounts
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        //print the stats for Sidney Crosby
        NHLStatistics.searchByPlayer("Sidney Crosby");

        //print the stats for Philadephia Flyers
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        
        //print the players in Anaheim Ducks ordered by points
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
    }
}
