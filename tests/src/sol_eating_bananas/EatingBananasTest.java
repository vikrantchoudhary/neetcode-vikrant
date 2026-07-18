package sol_eating_bananas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests for "eating-bananas" (Data Structures & Algorithms/eating-bananas/submission-0.java)
class EatingBananasTest {
    @Test
    void caseA() {
        assertEquals(4, new Solution().minEatingSpeed(new int[]{3,6,7,11}, 8));
    }

    @Test
    void caseB() {
        assertEquals(30, new Solution().minEatingSpeed(new int[]{30,11,23,4,20}, 5));
    }

    @Test
    void caseC() {
        assertEquals(23, new Solution().minEatingSpeed(new int[]{30,11,23,4,20}, 6));
    }

}
