package sol_number_of_one_bits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests for "number-of-one-bits" (Data Structures & Algorithms/number-of-one-bits/submission-0.java)
class NumberOfOneBitsTest {
    @Test
    void eleven() {
        assertEquals(3, new Solution().hammingWeight(11));
    }

    @Test
    void zero() {
        assertEquals(0, new Solution().hammingWeight(0));
    }

    @Test
    void seven() {
        assertEquals(3, new Solution().hammingWeight(7));
    }

}
