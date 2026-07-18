package sol_longest_substring_without_duplicates;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests for "longest-substring-without-duplicates" (Data Structures & Algorithms/longest-substring-without-duplicates/submission-4.java)
class LongestSubstringWithoutDuplicatesTest {
    @Test
    void caseA() {
        assertEquals(3, new Solution().lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void allSame() {
        assertEquals(1, new Solution().lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void caseC() {
        assertEquals(3, new Solution().lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void empty() {
        assertEquals(0, new Solution().lengthOfLongestSubstring(""));
    }

}
