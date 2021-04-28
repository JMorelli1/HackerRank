import utils.Setup;

import java.util.Scanner;

public class CountingValleys {
    private static int numOfValleys;
    public static int countingValleys(int steps, String path) {
        numOfValleys = 0;
        String [] paths = path.split("");
        int currentLoc = 0;
        for(String step : paths){
            if(step.equals("D")){
                currentLoc -=1;
            }
            else if(step.equals("U")){
                if(currentLoc + 1 == 0){
                    numOfValleys += 1;
                }
                currentLoc += 1;
            }
        }
        return numOfValleys;
    }
    public static void main(String [] args){
        Scanner scan = Setup.getScannerInstance();
        int steps = scan.nextInt();
        String path = scan.next();
        Setup.closeScannerInstance();
    }
}
