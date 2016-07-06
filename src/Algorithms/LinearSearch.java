package Algorithms;

/**
 * Created by ddvlslyr on 27/6/16.
 */
public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int result = linearSearch(arr, 6);

        if (result == -1)
            System.out.println("Number not found");
        else
            System.out.println("Number found at pos: " + result);
    }

    private static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++)
            if (key == arr[i])
                return ++i;
        return -1;
    }
}
