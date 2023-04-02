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
}
