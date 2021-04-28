package utils;

import java.util.Scanner;

public class Setup {

    private static Scanner scanner;

    public static Scanner getScannerInstance(){
        if(scanner == null){
            scanner = new Scanner(System.in);
            return scanner;
        }
        return scanner;
    }

    public static void closeScannerInstance(){
        scanner.close();
    }
}
