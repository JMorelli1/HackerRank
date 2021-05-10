
/*
This is a solution to a codility problem https://app.codility.com/programmers/lessons/5-prefix_sums/count_div/
 */
public class CountDiv {
    public int solution(int A, int B, int K) {
        int tracker = 0;
        int lowerEndDiff = 0;
        int upperEndDiff = 0;

        if(A % K != 0){
            lowerEndDiff = A % K;
        }
        else if(A > 0){
            tracker += 1;
        }
        if(B % K != 0){
            upperEndDiff = B % K;
        }

        A = A - lowerEndDiff;
        B = B - upperEndDiff;
        if(B != 0){
            tracker += (B-A)/K;
        }
        return tracker;
    }
}
