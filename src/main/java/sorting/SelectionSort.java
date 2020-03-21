package sorting;

/**
 * Worst-case 	O(n^2)
 * Best-case 	O(n^2)
 * Average 	    O(n^2)
 * unstable
 */
public class SelectionSort {

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) index = j;
            }
            if (index != i) {
                int tmp = arr[i];
                arr[i] = arr[index];
                arr[index] = tmp;
            }
        }
        return arr;
    }
}
