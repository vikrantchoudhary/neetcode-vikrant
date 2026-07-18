package sol_longest_consecutive_sequence;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests for "longest-consecutive-sequence" (Data Structures & Algorithms/longest-consecutive-sequence/submission-0.java)
class LongestConsecutiveSequenceTest {
    @Test
    void caseA() {
        assertEquals(4, new Solution().longestConsecutive(new int[]{100,4,200,1,3,2}));
    }

    @Test
    void caseB() {
        assertEquals(9, new Solution().longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
    }

    @Test
    void empty() {
        assertEquals(0, new Solution().longestConsecutive(new int[]{}));
    }

}
