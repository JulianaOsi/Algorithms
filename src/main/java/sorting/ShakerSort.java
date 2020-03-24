package sorting;

/**
 * Worst-case 	O(n^2)
 * Best-case 	O(n)
 * Average 	    O(n^2)
 * stable
 */
public class ShakerSort {
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            boolean isSwapped = false;
            for (int j = i; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    isSwapped = true;
                }
            }
            if (!isSwapped) break;
            isSwapped = false;

            for (int k = arr.length - i - 2; k > i; k--) {
                if (arr[k] < arr[k - 1]) {
                    swap(arr, k, k - 1);
                    isSwapped = true;
                }
            }

            if (!isSwapped) break;
        }
        return arr;
    }

    private static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
