/*
This is a solution to a Codility problem https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
 */
public class FrogJmp {

        public static int solution(int X, int Y, int D) {
            // write your code in Java SE 8

            int jumpDifference = ((Y-X) % D);
            int minJumps = ((Y - X - jumpDifference) / D);

            if(jumpDifference > 0){
                minJumps++;
            }
            return minJumps;
        }

        public static void main(String [] args){
            System.out.println(FrogJmp.solution(10, 85, 30));
        }
}
