package utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;

public class GenerateTestData {

    public static int [] generateRandomIntArray(int size, int lowerBound, int upperBound){
        return new Random().ints(size, lowerBound, upperBound).toArray();
    }

    public static Integer [] convertIntArrayToInteger(int [] arr){
        return Arrays.stream(arr).boxed().toArray(Integer[]::new);
    }

    public static Integer [] generateRandomIntegerArray(int size, int lowerBound, int upperBound){
        int [] arr = new Random().ints(size, lowerBound, upperBound).toArray();
        Integer [] integerArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        return integerArr;
    }
}
