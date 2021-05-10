import java.util.Arrays;

/*
This is a solution to a codility problem https://app.codility.com/programmers/lessons/5-prefix_sums/genomic_range_query/
 */
public class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        String [] DNA = S.split("");
        int [] queryResults = new int[P.length];
        int temp;
        for(int i = 0; i<P.length; i++){
            temp = 4;
            for(int x = P[i]; x <= Q[i]; x++){
                if(DNA[x].equals("A")){
                    queryResults[i]=1;
                    temp = 1;
                    break;
                }
                if(DNA[x].equals("C") && temp > 2){
                    temp = 2;
                }
                else if(DNA[x].equals("G") && temp > 3){
                    temp = 3;
                }
            }
            if(temp != 1)
                queryResults[i] = temp;
        }
        return queryResults;
    }

    public static int[] optimalSolution(String S, int[] P, int[]Q){
        int [][] totalOccurrence = new int[S.length()][4];
        int [] queryResults = new int[P.length];
        int leftIndex;
        int rightIndex;
        int temp;

        //Establish the letter that occurs at all positions of the string
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == 'A') totalOccurrence[i][0] = 1;
            if(S.charAt(i) == 'C') totalOccurrence[i][1] = 1;
            if(S.charAt(i) == 'G') totalOccurrence[i][2] = 1;
            if(S.charAt(i) == 'T') totalOccurrence[i][3] = 1;
        }

        //Add all subsequent rows to the each row creating the total occurrence
        for(int i = 1; i < totalOccurrence.length; i++){
            for(int x = 0; x < 4; x++){
                totalOccurrence[i][x] += totalOccurrence[i-1][x];
            }
        }

        for(int i = 0; i < P.length; i++){
            leftIndex = P[i];
            rightIndex = Q[i];


            //Checks the row previous to the leftIndex to catch all values within the range since the leftIndex row would already include the occurrence of its rows letter
            for(int x = 0; x < 4; x++){
                temp = 0;
                if(leftIndex-1 >= 0){
                    temp = totalOccurrence[leftIndex - 1][x];
                }
                if(totalOccurrence[rightIndex][x] - temp > 0){
                    queryResults[i] = x+1;
                    break;
                }
            }
        }
        return queryResults;
    }
}
