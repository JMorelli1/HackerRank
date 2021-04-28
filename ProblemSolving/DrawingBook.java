import utils.Setup;

import java.util.Scanner;

/*
This is a solution for https://www.hackerrank.com/challenges/drawing-book/problem
 */

public class DrawingBook {

    public static void main(String [] args){

        Scanner scan = Setup.getScannerInstance();
        int n = scan.nextInt();
        int p = scan.nextInt();
        System.out.println(pageCount(n, p));
        Setup.closeScannerInstance();
    }
    public static int pageCount(int n, int p) {
        if(p == 1 || p == n || (p%2 == 0 && p == (n-1))){
            return 0;
        }
        else if(p % 2 != 0 && p == (n-1)){
            return 1;
        }
        else if(p < (n/2)){
            if(p % 2 ==0){
                return (p/2);
            }
            else{
                return ((p-1)/2);
            }
        }
        else if(p <= (n/2)){
            if(p % 2 ==0){
                return (p/2);
            }
            else{
                return ((p-1)/2);
            }
        }
        else if(p > (n/2)){
            if((n-p)%2 == 0){
                return ((n-p)/2);
            }
            else{
                return((n-p-1)/2);
            }
        }
        return 0;
    }
}
