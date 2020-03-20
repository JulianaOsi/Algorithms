package search;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinearSearchTests {

    int[] arr1 = new int[]{2};
    int[] arr2 = new int[]{5, 1, 7, 9};
    int[] arr3 = new int[]{8, 7, 1};

    int[] sortedArr1 = new int[]{1, 2, 3};
    int[] sortedArr2 = new int[]{1, 2, 3, 4};


    @Test
    public void testSearch() {
        assertEquals(0, LinearSearch.search(arr1, 2));
        assertEquals(2, LinearSearch.search(arr2, 7));
        assertEquals(2, LinearSearch.search(arr3, 1));
        assertEquals(-1, LinearSearch.search(arr3, 2));
        assertEquals(1, LinearSearch.search(arr3, 7));
    }

    @Test
    public void testSearchInSortedArr() {
        assertEquals(0, LinearSearch.searchInSortedArr(arr1, 2));
        assertEquals(1, LinearSearch.searchInSortedArr(sortedArr1, 2));
        assertEquals(2, LinearSearch.searchInSortedArr(sortedArr2, 3));
        assertEquals(3, LinearSearch.searchInSortedArr(sortedArr2, 4));
        assertEquals(-1, LinearSearch.searchInSortedArr(sortedArr1, 5));
    }
}


