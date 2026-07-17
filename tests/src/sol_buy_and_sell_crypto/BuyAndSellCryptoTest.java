package sol_buy_and_sell_crypto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests for "buy-and-sell-crypto" (Data Structures & Algorithms/buy-and-sell-crypto/submission-0.java)
class BuyAndSellCryptoTest {
    @Test
    void profit() {
        assertEquals(5, new Solution().maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    void noProfit() {
        assertEquals(0, new Solution().maxProfit(new int[]{7,6,4,3,1}));
    }

}
