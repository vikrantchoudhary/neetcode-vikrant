package sol_maximum_product_subarray;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests for "maximum-product-subarray" (Data Structures & Algorithms/maximum-product-subarray/submission-2.java)
class MaximumProductSubarrayTest {
    @Test
    void caseA() {
        assertEquals(6, new Solution().maxProduct(new int[]{2,3,-2,4}));
    }

    @Test
    void withZero() {
        assertEquals(0, new Solution().maxProduct(new int[]{-2,0,-1}));
    }

    @Test
    void twoNeg() {
        assertEquals(24, new Solution().maxProduct(new int[]{-2,3,-4}));
    }

}
