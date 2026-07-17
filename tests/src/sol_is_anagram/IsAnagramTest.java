package sol_is_anagram;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests for "is-anagram" (Data Structures & Algorithms/is-anagram/submission-0.java)
class IsAnagramTest {
    @Test
    void anagram() {
        assertTrue(new Solution().isAnagram("anagram", "nagaram"));
    }

    @Test
    void notAnagram() {
        assertFalse(new Solution().isAnagram("rat", "car"));
    }

    @Test
    void differentLength() {
        assertFalse(new Solution().isAnagram("a", "ab"));
    }

    @Test
    void same() {
        assertTrue(new Solution().isAnagram("ab", "ba"));
    }

}
