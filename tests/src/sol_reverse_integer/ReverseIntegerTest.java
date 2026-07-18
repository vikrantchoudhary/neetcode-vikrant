package sol_reverse_integer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests for "reverse-integer" (Data Structures & Algorithms/reverse-integer/submission-0.java)
class ReverseIntegerTest {
    @Test
    void positive() {
        assertEquals(321, new Solution().reverse(123));
    }

    @Test
    void negative() {
        assertEquals(-321, new Solution().reverse(-123));
    }

    @Test
    void trailingZero() {
        assertEquals(21, new Solution().reverse(120));
    }

    @Test
    void overflow() {
        assertEquals(0, new Solution().reverse(1534236469));
    }

}
