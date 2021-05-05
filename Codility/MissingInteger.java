import java.util.*;

public class MissingInteger {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int min = 1;
        for(int num : A){
            if(num == min)
                min++;
        }
        return min;
    }
}
