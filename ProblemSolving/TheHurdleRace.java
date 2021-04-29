import utils.Setup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheHurdleRace {

    public static int hurdleRace(int k, List<Integer> height) {
        Integer doses = 0;
        for(Integer hurdle : height){
            if(hurdle > k && hurdle-k > doses)
                doses = hurdle-k;
        }
        return doses;
    }

    public static void main(String [] args){
        Scanner scan = Setup.getScannerInstance();
        List<Integer> hurdles = new ArrayList<>();
        System.out.println("Enter the height the racer can jump.");
        int k = scan.nextInt();
        Integer n = 0;
        System.out.println("Enter your integers for the hurdle heights. Enter -1 when finished.");
        while(n != -1) {
            n = scan.nextInt();
            if(n != -1)
                hurdles.add(n);
        }
        System.out.println("There are " + hurdleRace(k,hurdles) + " doses required to complete this race.");
    }
}
