package sol_house_robber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests for "house-robber" (Data Structures & Algorithms/house-robber/submission-0.java)
class HouseRobberTest {
    @Test
    void caseA() {
        assertEquals(4, new Solution().rob(new int[]{1,2,3,1}));
    }

    @Test
    void caseB() {
        assertEquals(12, new Solution().rob(new int[]{2,7,9,3,1}));
    }

    @Test
    void single() {
        assertEquals(5, new Solution().rob(new int[]{5}));
    }

}
