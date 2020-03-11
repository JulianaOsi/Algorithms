package searches;

/**
 * Worst-case 	O(log n)
 * Best-case 	O(1)
 * Average 	    O(log n)
 * sorted
 */
public class BinarySearch {
    public static int search (int[] arr, int val) {
        int first = 0;
        int last = arr.length - 1;
        while (first <= last) {
            int middle = (first + last)/2;
            if (arr[middle] == val) return middle;
            else if (arr[middle] < val) first = middle + 1;
            else if (arr[middle] > val) last = middle - 1;
        }
        return -1;
    }

    public static int recursiveSearch (int[] arr, int val, int first, int last) {
        if (first <= last) {
            int middle = (first + last)/2;
            if (arr[middle] == val) return middle;
            else if (arr[middle] < val) return recursiveSearch(arr, val, middle + 1, last);
            else if (arr[middle] > val) return recursiveSearch(arr, val, first, middle - 1);
        }
        return -1;
    }
}
