
/*
This is a solution to a codility problem https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
 */
public class TapeEquilibrium {
        int leftTotal = 0;
        int rightTotal = 0;
        public int solution(int[] A) {
            establishSides(A);
            int minimum = Math.abs(leftTotal-rightTotal);
            for(int i = 1; i < A.length-1; i++){
                leftTotal += A[i];
                rightTotal -= A[i];
                if(Math.abs(leftTotal - rightTotal) < minimum)
                    minimum = Math.abs(leftTotal - rightTotal);
            }
            return minimum;
        }

        public void establishSides(int [] A){
            leftTotal = A[0];
            for(int i = 1; i < A.length; i++){
                rightTotal += A[i];
            }
        }
    }
