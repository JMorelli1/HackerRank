import java.util.HashMap;
import java.util.Map;

/*
This is a solution for a codility problem https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
Speed: O(M+N)
 */
public class FrogRiverOne {

    public int solution(int X, int[] A) {
        // write your code in Java SE 8

        Integer shortestTime = 0;
        Map<Integer,Integer> currentLeaves = new HashMap<>();
        for(int i = 0; i < A.length; i++){
            if(!currentLeaves.containsKey(A[i])){
                currentLeaves.put(A[i], i);
            }
        }
        for(int i = 1; i <= X; i++){
            if(!currentLeaves.containsKey(i)){
                return - 1;
            }
            if(shortestTime < currentLeaves.get(i)){
                shortestTime = currentLeaves.get(i);
            }
        }
        return shortestTime;
    }
}
