package sol_single_number;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests for "single-number" (Data Structures & Algorithms/single-number/submission-0.java)
class SingleNumberTest {
    @Test
    void caseA() {
        assertEquals(1, new Solution().singleNumber(new int[]{2,2,1}));
    }

    @Test
    void caseB() {
        assertEquals(4, new Solution().singleNumber(new int[]{4,1,2,1,2}));
    }

    @Test
    void single() {
        assertEquals(7, new Solution().singleNumber(new int[]{7}));
    }

}
