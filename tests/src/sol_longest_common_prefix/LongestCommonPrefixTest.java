package sol_longest_common_prefix;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests for "longest-common-prefix" (Data Structures & Algorithms/longest-common-prefix/submission-9.java)
class LongestCommonPrefixTest {
    @Test
    void common() {
        assertEquals("fl", new Solution().longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    @Test
    void none() {
        assertEquals("", new Solution().longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

    @Test
    void single() {
        assertEquals("abc", new Solution().longestCommonPrefix(new String[]{"abc"}));
    }

}
