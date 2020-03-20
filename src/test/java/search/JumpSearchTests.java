package search;

import org.junit.Test;

import static org.junit.Assert.*;

public class JumpSearchTests {

    int[] arr1 = new int[]{1};
    int[] arr3 = new int[]{9, 13, 47, 80, 91};
    int[] arr4 = new int[]{9, 13, 47, 80, 91, 93, 98, 101, 102};

    @Test
    public void search() {
        assertEquals(0, JumpSearch.search(arr1, 1));
        assertEquals(2, JumpSearch.search(arr3, 47));
        assertEquals(4, JumpSearch.search(arr3, 91));
        assertEquals(1, JumpSearch.search(arr3, 13));
        assertEquals(7, JumpSearch.search(arr4, 101));
    }
}