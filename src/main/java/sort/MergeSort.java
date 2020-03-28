package sort;

/**
 * Worst-case 	O(n log n)
 * Best-case 	O(n log n)
 * T(n) = 2T(n/2) + O(n) = O(n log n)
 * Average 	    O(n log n)
 * Auxiliary Space: O(n)
 * stable
 */
public class MergeSort {

    public static void sort(int[] arr, int start, int end) {
        int mid = (start + end) / 2;
        if (start < end) {
            sort(arr, start, mid);
            sort(arr, mid + 1, end);

            merge(arr, start, mid, end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int k = 0;
        int[] tmpArr = new int[end - start + 1];

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j])
                tmpArr[k++] = arr[i++];
            else
                tmpArr[k++] = arr[j++];
        }

        while (i <= mid) {
            tmpArr[k++] = arr[i++];
        }

        while (j <= end) {
            tmpArr[k++] = arr[j++];
        }

        for (int m = 0; m < tmpArr.length; m++) {
            arr[m + start] = tmpArr[m];
        }
    }
}
