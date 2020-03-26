package sort;

/**
 * Worst-case 	O(n^2)
 * Best-case 	O(n)
 * Average 	    O(n^2)
 * stable
 */
public class ShuttleSort {

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
                for (int j = i; j > 0; j--) {
                    while (arr[j - 1] > arr[j])
                        swap(arr, j, j - 1);
                }
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
