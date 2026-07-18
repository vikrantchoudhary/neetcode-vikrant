package sol_find_minimum_in_rotated_sorted_array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests for "find-minimum-in-rotated-sorted-array" (Data Structures & Algorithms/find-minimum-in-rotated-sorted-array/submission-1.java)
class FindMinimumInRotatedSortedArrayTest {
    @Test
    void caseA() {
        assertEquals(1, new Solution().findMin(new int[]{3,4,5,1,2}));
    }

    @Test
    void caseB() {
        assertEquals(0, new Solution().findMin(new int[]{4,5,6,7,0,1,2}));
    }

    @Test
    void sorted() {
        assertEquals(11, new Solution().findMin(new int[]{11,13,15,17}));
    }

    @Test
    void single() {
        assertEquals(1, new Solution().findMin(new int[]{1}));
    }

}
