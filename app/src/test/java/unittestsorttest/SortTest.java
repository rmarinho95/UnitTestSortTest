package unittestsorttest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class SortTest {
    @Test
    void testSort() {
        int[] arr = {4, 2, 1, 3};
        int[] expected = {1, 2, 3, 4};
        Sort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortEmpty() {
        int[] arr = {};
        int[] expected = {};
        Sort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortAlreadySorted() {
        int[] arr = {1, 2, 3, 4};
        int[] expected = {1, 2, 3, 4};
        Sort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortSingleElement() {
        int[] arr = {1};
        int[] expected = {1};
        Sort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortNegativeNumbers() {
        int[] arr = {-4, 2, -1, 3};
        int[] expected = {-4, -1, 2, 3};
        Sort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortDuplicateNumbers() {
        int[] arr = {2, 1, 3, 2};
        int[] expected = {1, 2, 2, 3};
        Sort.sort(arr);
        assertArrayEquals(expected, arr);
    }
    
    @Test
    void testSortLargeArray() {
        int[] arr = {4, 3, 2, 1, 6, 5, 8, 7, 10, 9};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Sort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortReverseOrder() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        Sort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortWithDuplicates() {
        int[] arr = {2, 1, 3, 2, 1};
        int[] expected = {1, 1, 2, 2, 3};
        Sort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortAllEqual() {
        int[] arr = {3, 3, 3, 3, 3};
        int[] expected = {3, 3, 3, 3, 3};
        Sort.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortMixedNumbers() {
        int[] arr = {9, -3, 4, -8, 6};
        int[] expected = {-8, -3, 4, 6, 9};
        Sort.sort(arr);
        assertArrayEquals(expected, arr);
    }

}