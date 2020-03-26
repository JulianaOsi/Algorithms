package sort;

/**
 * Worst-case 	O(n^2)
 * Best-case 	O(n)
 * Average 	    O(n^2)
 * stable
 */
public class BubbleSort {

    public static int[] sort(int[] arr) {
        boolean isSwapped = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) break;
        }
        return arr;
    }
}
