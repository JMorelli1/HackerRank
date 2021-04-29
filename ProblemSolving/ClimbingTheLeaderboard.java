import utils.Stopwatch;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
This is a solution to https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem

The problem does not seem to carry over the players previous scores to the next ranking evaluation.
 */
public class ClimbingTheLeaderboard {

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        Stopwatch.start();

        List<Integer> rankings = new ArrayList<>();
        Integer position = 0;
        Integer positionalScore = -1;

        //One of the constraints is that the player scores are in ascending order
        for (int i = player.size()-1, j = 0; i >= 0; i--) {
            for (; j < ranked.size(); j++) {
                if (player.get(i) >= ranked.get(j)) {
                    if(ranked.get(j).compareTo(positionalScore) != 0) {
                        position++;
                        positionalScore = ranked.get(j);
                    }
                    rankings.add(position);
                    break;
                } else if (ranked.get(j).compareTo(positionalScore) != 0) {
                    position++;
                    positionalScore = ranked.get(j);
                }
                //Catches any scores at the end that dont beat any of the ranks
                if (j == ranked.size() - 1) {
                    rankings.add(position + 1);
                    break;
                }
            }
        }
        rankings.sort(Comparator.reverseOrder());
        System.out.println("Time to complete: " + Stopwatch.stop() + " seconds");
        return rankings;
    }
}
