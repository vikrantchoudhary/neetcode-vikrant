package sol_duplicate_integer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests for "duplicate-integer" (Data Structures & Algorithms/duplicate-integer/submission-0.java)
class DuplicateIntegerTest {
    @Test
    void hasDup() {
        assertTrue(new Solution().hasDuplicate(new int[]{1,2,3,3}));
    }

    @Test
    void noDup() {
        assertFalse(new Solution().hasDuplicate(new int[]{1,2,3,4}));
    }

    @Test
    void empty() {
        assertFalse(new Solution().hasDuplicate(new int[]{}));
    }

}
