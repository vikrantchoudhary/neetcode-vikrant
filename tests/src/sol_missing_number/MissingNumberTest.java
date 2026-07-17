package sol_missing_number;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests for "missing-number" (Data Structures & Algorithms/missing-number/submission-0.java)
class MissingNumberTest {
    @Test
    void caseA() {
        assertEquals(2, new Solution().missingNumber(new int[]{3,0,1}));
    }

    @Test
    void caseB() {
        assertEquals(2, new Solution().missingNumber(new int[]{0,1}));
    }

    @Test
    void caseC() {
        assertEquals(8, new Solution().missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }

}
