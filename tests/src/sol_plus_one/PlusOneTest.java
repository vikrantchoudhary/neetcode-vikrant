package sol_plus_one;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests for "plus-one" (Data Structures & Algorithms/plus-one/submission-2.java)
class PlusOneTest {
    @Test
    void simple() {
        assertArrayEquals(new int[]{1,2,4}, new Solution().plusOne(new int[]{1,2,3}));
    }

    @Test
    void carry() {
        assertArrayEquals(new int[]{1,0}, new Solution().plusOne(new int[]{9}));
    }

    @Test
    void multiCarry() {
        assertArrayEquals(new int[]{2,0,0}, new Solution().plusOne(new int[]{1,9,9}));
    }

}
