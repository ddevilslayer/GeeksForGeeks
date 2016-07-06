package Algorithms;

import java.util.Arrays;

/**
 * Created by ddvlslyr on 27/6/16.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 33, 22, 77, 90, 55, 40};

        Arrays.sort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));

        int result = binarySearch(arr, 0, arr.length, 90);

        if (result == -1)
            System.out.println("Number not found");
        else
            System.out.println("Number found at pos: " + result);

    }


    private static int binarySearch(int arr[], int left, int right, int key) {
        if (left <= right) {
            int mid = (left + right) / 2;

            if (key == arr[mid])
                return ++mid;

            else if (key < arr[mid])
                return binarySearch(arr, left, mid - 1, key);

            else if (key > arr[mid])
                return binarySearch(arr, mid, right, key);
        }
        return -1;
    }
}