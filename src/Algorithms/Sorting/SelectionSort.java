package Algorithms.Sorting;

import java.util.Arrays;

/**
 * Created by ddvlslyr on 29/6/16.
 */
public class SelectionSort {

    public static void main(String args[]) {

        int[] array = new int[]{66, 69, 17, 1, 16, 44, 1};

        selectionsort(array);
    }


    private static void selectionsort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(array));
    }
}
