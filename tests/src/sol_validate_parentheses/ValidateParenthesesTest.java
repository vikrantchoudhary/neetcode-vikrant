package sol_validate_parentheses;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests for "validate-parentheses" (Data Structures & Algorithms/validate-parentheses/submission-0.java)
class ValidateParenthesesTest {
    @Test
    void simple() {
        assertTrue(new Solution().isValid("()"));
    }

    @Test
    void allTypes() {
        assertTrue(new Solution().isValid("()[]{}"));
    }

    @Test
    void mismatch() {
        assertFalse(new Solution().isValid("(]"));
    }

    @Test
    void interleaved() {
        assertFalse(new Solution().isValid("([)]"));
    }

    @Test
    void nested() {
        assertTrue(new Solution().isValid("{[]}"));
    }

}
