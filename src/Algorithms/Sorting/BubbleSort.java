package Algorithms.Sorting;

import java.util.Arrays;

/**
 * Created by ddvlslyr on 29/6/16.
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] array = new int[]{66, 69, 17, 1, 16, 44, 1};
        bubbleSort(array);

    }

    private static void bubbleSort(int[] array) {
        boolean swapped = false;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    swapped = true;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            if (!swapped)
                break;
        }

        System.out.print(Arrays.toString(array));
    }
}
