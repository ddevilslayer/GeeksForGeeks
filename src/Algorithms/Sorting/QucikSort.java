package Algorithms.Sorting;

import Algorithms.Helper;

import java.util.Arrays;

/**
 * Created by ddvlslyr on 7/7/16.
 */
public class QucikSort {

    public static void main(String[] args) {

        int ar[] = Helper.takeArrayInput(5);
        quickSort(ar, 0, ar.length - 1);

        System.out.println(Arrays.toString(ar));
    }

    private static void quickSort(int ar[], int left, int end) {
        if (left < end) {
            int p = partition(ar, left, end);
            quickSort(ar, left, p - 1);
            quickSort(ar, p + 1, end);

        }
    }

    private static int partition(int ar[], int left, int right) {

        int pivot = ar[right];
        int i = left - 1;

        for (int j = left; j <= right - 1; j++) {
            if (ar[j] <= pivot) {
                i++;
                Helper.swapNumber(ar, i, j);
            }
        }
        Helper.swapNumber(ar, i + 1, right);
        return i + 1;
    }
}
