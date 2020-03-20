package search;

/**
 * Worst-case 	O(n)
 * Best-case 	O(1)
 * Average 	    O(n)
 * unsorted/sorted
 */

public class LinearSearch {

    public static int search(int[] arr, int val) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int searchInSortedArr(int[] arr, int val) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                index = i;
                break;
            } else if (arr[i] > val) {
                break;
            }
        }
        return index;
    }
}
