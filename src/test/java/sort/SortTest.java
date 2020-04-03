package sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortTest {

    int[] arr1 = new int[]{1};
    int[] arr2 = new int[]{3, 2};
    int[] arr3 = new int[]{1, 2, 3};
    int[] arr4 = new int[]{1, 4, 5, 0, 3};

    @Test
    public void bubbleSortTest() {
        assertArrayEquals(new int[]{1}, BubbleSort.sort(arr1));
        assertArrayEquals(new int[]{2, 3}, BubbleSort.sort(arr2));
        assertArrayEquals(new int[]{1, 2, 3}, BubbleSort.sort(arr3));
        assertArrayEquals(new int[]{0, 1, 3, 4, 5}, BubbleSort.sort(arr4));
    }

    @Test
    public void insertionSortTest() {
        assertArrayEquals(new int[]{1}, InsertionSort.sort(arr1));
        assertArrayEquals(new int[]{2, 3}, InsertionSort.sort(arr2));
        assertArrayEquals(new int[]{1, 2, 3}, InsertionSort.sort(arr3));
        assertArrayEquals(new int[]{0, 1, 3, 4, 5}, InsertionSort.sort(arr4));
    }

    @Test
    public void selectionSortTest() {
        assertArrayEquals(new int[]{1}, SelectionSort.sort(arr1));
        assertArrayEquals(new int[]{2, 3}, SelectionSort.sort(arr2));
        assertArrayEquals(new int[]{1, 2, 3}, SelectionSort.sort(arr3));
        assertArrayEquals(new int[]{0, 1, 3, 4, 5}, SelectionSort.sort(arr4));
    }

    @Test
    public void shakerSortTest() {
        assertArrayEquals(new int[]{1}, ShakerSort.sort(arr1));
        assertArrayEquals(new int[]{2, 3}, ShakerSort.sort(arr2));
        assertArrayEquals(new int[]{1, 2, 3}, ShakerSort.sort(arr3));
        assertArrayEquals(new int[]{0, 1, 3, 4, 5}, ShakerSort.sort(arr4));
    }

    @Test
    public void shuttleSortTest() {
        assertArrayEquals(new int[]{1}, ShuttleSort.sort(arr1));
        assertArrayEquals(new int[]{2, 3}, ShuttleSort.sort(arr2));
        assertArrayEquals(new int[]{1, 2, 3}, ShuttleSort.sort(arr3));
        assertArrayEquals(new int[]{0, 1, 3, 4, 5}, ShuttleSort.sort(arr4));
    }

    @Test
    public void quickSortTest() {
        QuickSort.sort(arr1, 0, arr1.length - 1);
        assertArrayEquals(new int[]{1}, arr1);

        QuickSort.sort(arr2, 0, arr2.length - 1);
        assertArrayEquals(new int[]{2, 3}, arr2);

        QuickSort.sort(arr3, 0, arr3.length - 1);
        assertArrayEquals(new int[]{1, 2, 3}, arr3);

        QuickSort.sort(arr4, 0, arr4.length - 1);
        assertArrayEquals(new int[]{0, 1, 3, 4, 5}, arr4);
    }

    @Test
    public void MergeSortTest() {
        MergeSort.sort(arr1, 0, arr1.length - 1);
        assertArrayEquals(new int[]{1}, arr1);

        MergeSort.sort(arr2, 0, arr2.length - 1);
        assertArrayEquals(new int[]{2, 3}, arr2);

        MergeSort.sort(arr3, 0, arr3.length - 1);
        assertArrayEquals(new int[]{1, 2, 3}, arr3);

        MergeSort.sort(arr4, 0, arr4.length - 1);
        assertArrayEquals(new int[]{0, 1, 3, 4, 5}, arr4);
    }

    @Test
    public void CountingSortTest() {
        assertArrayEquals(new int[]{1}, CountingSort.sort(arr1, 0, 5));
        assertArrayEquals(new int[]{2, 2}, CountingSort.sort(new int[]{2, 2}, 2, 2));
        assertArrayEquals(new int[]{2, 3, 3}, CountingSort.sort(new int[]{3, 2, 3}, 2, 3));
        assertArrayEquals(new int[]{1, 1, 3, 4, 4}, CountingSort.sort(new int[]{4, 1, 3, 4, 1}, 0, 6));
    }

    @Test
    public void BucketSortTest() {
        List<Integer> unsorted1 = Arrays.asList(80,50,60,30,20,10,70,0,40,500,600,602,200,15);
       List<Integer> expected1 = Arrays.asList(0,10,15,20,30,40,50,60,70,80,200,500,600,602);
        List<Integer> sorted1 = BucketSort.sort(unsorted1, 0, 602);

        List<Integer> unsorted2 = Arrays.asList(15, 18, 11, 20, 17, 13, 11, 16, 16, 10);
        List<Integer> expected2 = Arrays.asList(10, 11, 11, 13, 15, 16, 16, 17, 18, 20);
        List<Integer> sorted2 = BucketSort.sort(unsorted2, 10, 20);

        List<Integer> unsorted3 = Arrays.asList(2);
        List<Integer> expected3 = Arrays.asList(2);
        List<Integer> sorted3 = BucketSort.sort(unsorted3, 0, 3);

        assertEquals(expected1, sorted1);
        assertEquals(expected2, sorted2);
        assertEquals(expected3, sorted3);
    }
}
