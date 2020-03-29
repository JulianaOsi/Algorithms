package sort;

/**
 * Worst-case 	O(n + k)
 * Best-case 	O(n + k)
 * Average 	    O(n + k)
 * Auxiliary Space: O(k)
 * stable
 * better to use when k<<n
 */
public class CountingSort {

    public static int[] sort(int[] arr, int min, int max) {
        int[] count = new int[max - min + 1];

        for (int value : arr) {     // n
            count[value - min]++;
        }

        for (int i = 0, k = 0; i < count.length; i++) {   // k + n
            for (int j = 0; j < count[i]; j++, k++) {     //
                arr[k] = i + min;
            }
        }

        return arr;
    }
}
