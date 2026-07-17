package sol_min_cost_climbing_stairs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests for "min-cost-climbing-stairs" (Data Structures & Algorithms/min-cost-climbing-stairs/submission-0.java)
class MinCostClimbingStairsTest {
    @Test
    void caseA() {
        assertEquals(15, new Solution().minCostClimbingStairs(new int[]{10,15,20}));
    }

    @Test
    void caseB() {
        assertEquals(6, new Solution().minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
    }

}
