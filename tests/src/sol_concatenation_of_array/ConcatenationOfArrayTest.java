package sol_concatenation_of_array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests for "concatenation-of-array" (Data Structures & Algorithms/concatenation-of-array/submission-0.java)
class ConcatenationOfArrayTest {
    @Test
    void basic() {
        assertArrayEquals(new int[]{1,2,1,1,2,1}, new Solution().getConcatenation(new int[]{1,2,1}));
    }

    @Test
    void single() {
        assertArrayEquals(new int[]{7,7}, new Solution().getConcatenation(new int[]{7}));
    }

}
