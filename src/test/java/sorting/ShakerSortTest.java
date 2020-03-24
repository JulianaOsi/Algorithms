package sorting;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ShakerSortTest {

    @Test
    public void testSearchInSortedArr() {
        assertArrayEquals(new int[]{1}, ShakerSort.sort(new int[]{1}));
        assertArrayEquals(new int[]{2, 3}, ShakerSort.sort(new int[]{3, 2}));
        assertArrayEquals(new int[]{1, 2, 3}, ShakerSort.sort(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{0, 1 , 3, 4, 5}, ShakerSort.sort(new int[]{1, 4, 5, 0, 3}));
    }
}
