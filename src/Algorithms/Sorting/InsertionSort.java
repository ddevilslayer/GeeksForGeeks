package Algorithms.Sorting;

import Algorithms.Helper;

import java.util.Arrays;

/**
 * Created by ddvlslyr on 30/6/16.
 */
public class InsertionSort {
    public static void main(String args[]) {

        int[] array = Helper.takeArrayInput(5);
        insertionSort(array, array.length);
    }

    private static void insertionSort(int[] array, int size) {

        for (int i = 1; i < size; i++) {
            int j = i - 1, key = array[i];

            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        System.out.print(Arrays.toString(array));
    }
}