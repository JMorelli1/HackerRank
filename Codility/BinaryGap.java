/*
This is a solution for a Codility lesson https://app.codility.com/programmers/lessons/1-iterations/
 */
public class BinaryGap {

    public static int findBinaryGap(int num){

        String str = Integer.toBinaryString(num);
        String [] gaps = str.replaceAll("1+|0+$", " ").split(" ");

        int max = 0;
        for(String gap : gaps){
            if(gap.length() > max){
                max = gap.length();
            }
        }
        return max;
    }

    public static void main(String [] args){
        BinaryGap.findBinaryGap(1000);
        BinaryGap.findBinaryGap(6000);
        BinaryGap.findBinaryGap(35000);
        BinaryGap.findBinaryGap(60000);
        BinaryGap.findBinaryGap(32);
    }
}
