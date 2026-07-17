package sol_is_palindrome;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests for "is-palindrome" (Data Structures & Algorithms/is-palindrome/submission-5.java)
class IsPalindromeTest {
    @Test
    void phrase() {
        assertTrue(new Solution().isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void notPalindrome() {
        assertFalse(new Solution().isPalindrome("race a car"));
    }

    @Test
    void simple() {
        assertTrue(new Solution().isPalindrome("aba"));
    }

}
