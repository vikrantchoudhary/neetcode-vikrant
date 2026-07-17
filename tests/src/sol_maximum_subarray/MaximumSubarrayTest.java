package sol_maximum_subarray;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests for "maximum-subarray" (Data Structures & Algorithms/maximum-subarray/submission-0.java)
class MaximumSubarrayTest {
    @Test
    void mixed() {
        assertEquals(6, new Solution().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    @Test
    void single() {
        assertEquals(1, new Solution().maxSubArray(new int[]{1}));
    }

    @Test
    void allPositive() {
        assertEquals(23, new Solution().maxSubArray(new int[]{5,4,-1,7,8}));
    }

    @Test
    void allNegative() {
        assertEquals(-1, new Solution().maxSubArray(new int[]{-3,-1,-2}));
    }

}
