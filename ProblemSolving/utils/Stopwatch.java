package utils;

import java.util.concurrent.TimeUnit;

public class Stopwatch {

    private static long startTime = 0;
    private static long stopTime = 0;
    private static long elapsedTime = 0;
    private static boolean hasStarted = false;
    private static final double NANO_CONVERSION_VALUE = 1E9;

    public static void start(){
        if(hasStarted){
            System.out.println("Overwriting previous start time....");
        }
        startTime = System.nanoTime();
        hasStarted=true;
    }

    public static double stop(){
        stopTime = System.nanoTime();
        elapsedTime = stopTime - startTime;
        startTime = 0 ;
        hasStarted = false;
        return ((double) elapsedTime/NANO_CONVERSION_VALUE);
    }
}
