package sol_jump_game;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests for "jump-game" (Data Structures & Algorithms/jump-game/submission-0.java)
class JumpGameTest {
    @Test
    void reachable() {
        assertTrue(new Solution().canJump(new int[]{2,3,1,1,4}));
    }

    @Test
    void stuck() {
        assertFalse(new Solution().canJump(new int[]{3,2,1,0,4}));
    }

    @Test
    void single() {
        assertTrue(new Solution().canJump(new int[]{0}));
    }

}
