package Algorithms;

import java.util.Scanner;

/**
 * Created by ddvlslyr on 30/6/16.
 */
public class Helper {

    static public int[] takeArrayInput(int size) {

        Scanner in = new Scanner(System.in);
        int[] array = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        return array;
    }


    public static int[] swapNumber(int ar[], int from, int to) {
        if (from != to) {
            int temp = ar[from];
            ar[from] = ar[to];
            ar[to] = temp;
        }
        return ar;
    }

}
