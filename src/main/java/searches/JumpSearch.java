package searches;

import java.util.Arrays;

/**
 * Worst-case 	O(√n)
 * Best-case 	O(1)
 * Average 	    O(√n)
 * sorted
 */
public class JumpSearch {
    public static int search(int[] arr, int val) {
        int jump = (int) Math.round(Math.sqrt(arr.length));
        int left = 0;
        int right = Math.min(jump, arr.length - 1);
        while (right < arr.length && arr[right] < val) {
            right = Math.min(right + jump, arr.length - 1);
            left += jump;
        }
        int res = LinearSearch.search(Arrays.copyOfRange(arr, left, right + 1), val);
        return
                res == -1 ? -1 : res + left;
    }
}
