package sol_climbing_stairs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests for "climbing-stairs" (Data Structures & Algorithms/climbing-stairs/submission-0.java)
class ClimbingStairsTest {
    @Test
    void two() {
        assertEquals(2, new Solution().climbStairs(2));
    }

    @Test
    void three() {
        assertEquals(3, new Solution().climbStairs(3));
    }

    @Test
    void five() {
        assertEquals(8, new Solution().climbStairs(5));
    }

    @Test
    void one() {
        assertEquals(1, new Solution().climbStairs(1));
    }

}
