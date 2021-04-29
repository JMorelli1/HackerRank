import utils.Stopwatch;

import java.util.*;
import java.util.stream.Collectors;

/*
This is a solution for https://www.hackerrank.com/challenges/electronics-shop/problem

There is a very cool optimization for this from Ryan Fehr https://github.com/RyanFehr/HackerRank/blob/master/Algorithms/Implementation/Electronics%20Shop/Solution.java.
I included this to remind myself of this way of writing nested for loops as to not overwrite the nested index value.
 */

public class ElectronicsShop {

    private static List<Integer> options = new ArrayList<>();

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        Stopwatch.start();
        options.clear();
        for(int i = 0; i < keyboards.length; i++){
            for(int x = 0; x < drives.length; x++){
                if(keyboards[i] + drives[x] <= b){
                    options.add(keyboards[i] + drives[x]);
                }
            }
        }
        if(options.isEmpty()){
            return -1;
        }
        List<Integer> sortedOptions = options.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println("Time taken to complete: " + Stopwatch.stop() + " seconds");
        return sortedOptions.get(0);
    }

    //OPTIMIZED VERSION
    static int getMoneyOptimally(Integer[] keyboards, Integer[] drives, int budget){
        Stopwatch.start();
        Arrays.sort(keyboards,Comparator.reverseOrder());
        Arrays.sort(drives);
        Integer max = -1;

        for(int i = 0,j = 0; i < keyboards.length; i++){
            for(; j < drives.length; j++){
                //break keeps the j value from incrementing
                if(keyboards[i] + drives[j] > budget) break;
                if(keyboards[i] + drives[j] > max){
                    max = keyboards[i] + drives[j];
                }
            }
        }
        System.out.println("Time taken to optimal complete: " + Stopwatch.stop() + " seconds");
        return max;
    }
}
