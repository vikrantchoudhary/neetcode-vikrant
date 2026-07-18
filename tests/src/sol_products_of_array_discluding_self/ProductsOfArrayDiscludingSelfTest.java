package sol_products_of_array_discluding_self;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests for "products-of-array-discluding-self" (Data Structures & Algorithms/products-of-array-discluding-self/submission-0.java)
class ProductsOfArrayDiscludingSelfTest {
    @Test
    void caseA() {
        assertArrayEquals(new int[]{24,12,8,6}, new Solution().productExceptSelf(new int[]{1,2,3,4}));
    }

    @Test
    void withZero() {
        assertArrayEquals(new int[]{0,0,9,0,0}, new Solution().productExceptSelf(new int[]{-1,1,0,-3,3}));
    }

}
