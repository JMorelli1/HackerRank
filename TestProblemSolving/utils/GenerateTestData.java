package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;

public class GenerateTestData {

    private static FileInputStream inputStream;
    private static Scanner scan;

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

    public static List<Integer> scanFileIntoIntegerList(File file){

        try {
            inputStream = new FileInputStream(file);
            scan = new Scanner(inputStream);

            List<Integer> list = new ArrayList<>();
            String line;

            while (scan.hasNextLine()) {

                line = scan.nextLine();
                String[] arr = line.split(" ");

                for (String str : arr) {
                    list.add(Integer.parseInt(str));
                }
            }
            return list;
        }
        catch (Exception e){
            System.out.println("Error accessing test data file" + e);
            return null;
        }
    }
}
