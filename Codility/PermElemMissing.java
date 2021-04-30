/*
This is a solution to a codility problem https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
 */
public class PermElemMissing {

        public static int solution(int[] A) {
            int total = 0;
            int arrTotal = 0;
            if(A.length == 0){
                return 1;
            }
            for(int i = 0; i < A.length; i++){
                if(i == A.length - 1){
                    total += (i + 2);
                }
                total += i + 1;
                arrTotal += A[i];
            }
            return total - arrTotal;
        }
    public static void main(String[] args ) {
            int [] testArr = {1,2,3,4,5,7,8,9,10,11,12,13,14,15};
            System.out.println(PermElemMissing.solution(testArr));
    }
}
