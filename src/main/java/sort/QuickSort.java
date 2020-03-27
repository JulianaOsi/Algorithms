package sort;

/**
 * Worst-case 	O(n^2) (depends on the pivot)
 * in the worst case the array is split into 1 and n-1 elements
 * Best-case 	O(n log n)
 * log n - recursion depth
 * n - number of comparisons at each level
 * Average 	    O(n log n)
 * unstable
 */
public class QuickSort {

    public static void sort(int[] arr, int first, int last) {

        int left = first;
        int right = last;

        int middle = (left + right) / 2;
        int pivot = arr[middle];
        while (left < right) {
            while (arr[left] < pivot) left++;
            while (arr[right] > pivot) right--;

            if (left < right) swap(arr, left, right);
            left++;
            right--;
        }

        if (first < right) sort(arr, first, right);
        if (left < last) sort(arr, left, last);

    }

    private static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
