import java.util.Arrays;

/*
This is a solution to a Codility problem https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
 */
public class OddOccurrencesInArray {

    public static int findOddManOut(int [] arr){
        Arrays.sort(arr);
        int oddMan = 0;
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length - 1 || arr[i] != arr[i+1]){
                oddMan = arr[i];
                break;
            }
            i++;
        }
        return oddMan;
    }

    public static void main(String [] args){
        int [] arr = {1,2,2,1,5,7,7,5,8};
        System.out.println(OddOccurrencesInArray.findOddManOut(arr));
    }
}
