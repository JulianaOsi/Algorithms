package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Worst-case 	O(n^2)
 * when most of the elements land in the same bucket
 * Best-case 	O(n)
 * Average 	    O(n)
 * Auxiliary Space: O(n)
 * useful when the input elements are uniformly distributed over a range
 * stable/unstable
 */
public class BucketSort {
    public static List<Integer> sort(List<Integer> input, int min, int max) {
        int numberOfBuckets = (int) Math.ceil(Math.sqrt(max - min + 1));
        int bucketSize = (int) Math.ceil((float) (max - min + 1) / numberOfBuckets);
        List<List<Integer>> buckets = new ArrayList<>(numberOfBuckets);
        for (int i = 0; i < numberOfBuckets; i++) {
            buckets.add(new ArrayList<>());
        }

        for (int num : input) {
            buckets.get(getBucketIndex(num, min, bucketSize)).add(num);
        }

        List<Integer> result = new ArrayList<>();
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
            result.addAll(bucket);
        }
        return result;
    }

    private static int getBucketIndex(int num, int min, int bucketSize) {
        return (num - min)/bucketSize;
    }
}
