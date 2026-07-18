package sol_two_integer_sum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests for "two-integer-sum" (Data Structures & Algorithms/two-integer-sum/submission-0.java)
class TwoIntegerSumTest {
    @Test
    void basic() {
        assertArrayEquals(new int[]{0,1}, new Solution().twoSum(new int[]{2,7,11,15}, 9));
    }

    @Test
    void middle() {
        assertArrayEquals(new int[]{1,2}, new Solution().twoSum(new int[]{3,2,4}, 6));
    }

    @Test
    void duplicates() {
        assertArrayEquals(new int[]{0,1}, new Solution().twoSum(new int[]{3,3}, 6));
    }

    @Test
    void noPair() {
        assertArrayEquals(new int[]{-1,-1}, new Solution().twoSum(new int[]{1,2,3}, 100));
    }

}
