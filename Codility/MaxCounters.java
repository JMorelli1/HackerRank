
/*
This is a solution to a codility problem https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/

!!The first solution passes all correctness test but not the performance test, the solution below it solves all tests successfully!!
Speed: O(M+N)
 */
public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int [] counters = new int[N];
        int max = 0;
        int setMax = 0;
        for(int num : A){
            if(num <= N){
                if(setMax == 0) {
                    counters[num - 1] += 1;
                    if (counters[num - 1] > max)
                        max = counters[num - 1];
                }
                else{
                    if(counters[num - 1] < setMax){
                        counters[num - 1] = setMax + 1;
                        if (counters[num - 1] > max)
                            max = counters[num - 1];
                    }
                    else{
                        counters[num - 1] += 1;
                        if (counters[num - 1] > max)
                            max = counters[num - 1];
                    }
                }
            }
            if(num > N){
                setMax = max;
            }
        }
        return counters;
    }
}

//Optimized solution that tracks the set maximum for each maximize operation but only loops through the array again at the end
class Solution {
    public int[] solution(int N, int[] A) {
        int [] counters = new int[N];
        int max = 0;
        int setMax = 0;
        for(int num : A){
            if(num <= N){
                if(setMax == 0) {
                    counters[num - 1] += 1;
                    if (counters[num - 1] > max)
                        max = counters[num - 1];
                }
                else{
                    if(counters[num - 1] < setMax){
                        counters[num - 1] = setMax + 1;
                        if (counters[num - 1] > max)
                            max = counters[num - 1];
                    }
                    else{
                        counters[num - 1] += 1;
                        if (counters[num - 1] > max)
                            max = counters[num - 1];
                    }
                }
            }
            if(num > N){
                setMax = max;
            }
        }
        for(int i = 0; i < counters.length; i++){
            if(counters[i] < setMax){
                counters[i] = setMax;
            }
        }
        return counters;
    }
}
