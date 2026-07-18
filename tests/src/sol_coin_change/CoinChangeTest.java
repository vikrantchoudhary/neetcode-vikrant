package sol_coin_change;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests for "coin-change" (Data Structures & Algorithms/coin-change/submission-0.java)
class CoinChangeTest {
    @Test
    void caseA() {
        assertEquals(3, new Solution().coinChange(new int[]{1,2,5}, 11));
    }

    @Test
    void impossible() {
        assertEquals(-1, new Solution().coinChange(new int[]{2}, 3));
    }

    @Test
    void zero() {
        assertEquals(0, new Solution().coinChange(new int[]{1}, 0));
    }

}
