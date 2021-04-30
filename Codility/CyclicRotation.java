import java.util.Arrays;

/*
This is a solution to a Codility problem https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
 */

public class CyclicRotation {

        public int[] solution(int[] A, int K) {
            int temp1 = -1;
            int temp2;
            System.out.println("Original: " + Arrays.toString(A));
            if (A.length == 0) {
                return A;
            }
            //Optimized to only rotate the num of times that would actually affect the array
            int rotations = K >= A.length ? K % A.length : K;
            for (int i = 1; i <= rotations; i++) {
                for (int x = 0; x < A.length; x++) {
                    if (x == A.length - 1) {
                        A[0] = temp1;
                    } else if (x == 0) {
                        temp1 = A[x + 1];
                        A[x + 1] = A[x];
                    } else {
                        temp2 = A[x + 1];
                        A[x + 1] = temp1;
                        temp1 = temp2;
                    }
                }
            }
            System.out.println("Rotated "+ rotations + " time(s): " + Arrays.toString(A));
            return A;
        }
        public static void main(String [] args){
            int [] test1 = {1,4,2,3,6,8,4,1,4};
            int [] test2 = {-1,-3,-5,-3,-8,-5};
            int [] test3 = {};

            CyclicRotation cycle = new CyclicRotation();
            cycle.solution(test1, 4);
            cycle.solution(test2, 13);
            cycle.solution(test3, 2);
        }
}
