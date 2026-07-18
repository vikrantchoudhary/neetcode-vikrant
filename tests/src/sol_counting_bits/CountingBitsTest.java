package sol_counting_bits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests for "counting-bits" (Data Structures & Algorithms/counting-bits/submission-0.java)
class CountingBitsTest {
    @Test
    void upToFive() {
        assertArrayEquals(new int[]{0,1,1,2,1,2}, new Solution().countBits(5));
    }

    @Test
    void zero() {
        assertArrayEquals(new int[]{0}, new Solution().countBits(0));
    }

    @Test
    void upToTwo() {
        assertArrayEquals(new int[]{0,1,1}, new Solution().countBits(2));
    }

}
