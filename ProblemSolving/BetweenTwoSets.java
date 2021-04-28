import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
This is a solution for https://www.hackerrank.com/challenges/between-two-sets/problem
 */

public class BetweenTwoSets {

    private static List<Integer> betweenSet = new ArrayList<Integer>();

    public static int getTotalX(List<Integer> a, List<Integer> b) {

        getBetweenInts(a.get(a.size()-1), b.get(0));
        for(Integer num : a){
            betweenSet.removeIf(x -> (x % num != 0));
        }
        for(Integer num : b){
            betweenSet.removeIf(x -> (num % x  != 0));
        }
        return betweenSet.size();
    }

    private static void getBetweenInts(Integer start, Integer end){
        Integer startFactors = start;
        while(startFactors <= end){
            betweenSet.add(startFactors);
            startFactors += start;
        }
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for(int i = 0; i < n; i++){
            a.add(scan.nextInt());
        }
        for(int i = 0; i < m; i++){
            b.add(scan.nextInt());
        }
        BetweenTwoSets.getTotalX(a,b);
    }
}
