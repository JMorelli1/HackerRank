import java.util.*;
/*
This is a solution to a codility problem https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
 */
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
