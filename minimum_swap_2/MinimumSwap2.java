package minimum_swap_2;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinimumSwap2 {

    static private int findImdex(int [] arr, int value){
        int length = arr.length;
        for (int i = 0; i<length; i++){
            if(arr[i] == value)
                return i;
        }
        return 0;
    }
    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int length = arr.length;
        int index = 0;
        int swap = 0;
        for (int i = 0; i<length; i++){
            if(arr[i] != i+1){
                index = findImdex(arr, i+1);
                int tmp = arr[i];
                arr[i] = arr[index];
                arr[index] = tmp;
                swap++;
            }
        }
        return swap;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/a"));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);
        System.out.println(res);

        //bufferedWriter.write(String.valueOf(res));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}

