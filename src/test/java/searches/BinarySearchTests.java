package searches;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTests {

    int[] arr1 = new int[]{2};
    int[] sortedArr1 = new int[]{1, 2, 3};
    int[] sortedArr2 = new int[]{1, 2, 3, 4};

    @Test
    public void search() {
        assertEquals(0, LinearSearch.search(arr1, 2));
        assertEquals(1, LinearSearch.search(sortedArr1, 2));
        assertEquals(2, LinearSearch.search(sortedArr2, 3));
        assertEquals(3, LinearSearch.search(sortedArr2, 4));
        assertEquals(-1, LinearSearch.search(sortedArr1, 5));
    }

    @Test
    public void recursiveSearch() {
        assertEquals(0, BinarySearch.recursiveSearch(arr1, 2, 0, 0));
        assertEquals(1, BinarySearch.recursiveSearch(sortedArr1, 2,0, 2));
        assertEquals(2, BinarySearch.recursiveSearch(sortedArr2, 3, 0, 3));
        assertEquals(3, BinarySearch.recursiveSearch(sortedArr2, 4, 0, 3));
        assertEquals(-1, BinarySearch.recursiveSearch(sortedArr1, 5, 0, 2));
    }
}