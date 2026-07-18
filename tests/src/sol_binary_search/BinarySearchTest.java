package sol_binary_search;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests for "binary-search" (Data Structures & Algorithms/binary-search/submission-0.java)
class BinarySearchTest {
    @Test
    void found() {
        assertEquals(4, new Solution().search(new int[]{-1,0,3,5,9,12}, 9));
    }

    @Test
    void notFound() {
        assertEquals(-1, new Solution().search(new int[]{-1,0,3,5,9,12}, 2));
    }

    @Test
    void single() {
        assertEquals(0, new Solution().search(new int[]{5}, 5));
    }

    @Test
    void empty() {
        assertEquals(-1, new Solution().search(new int[]{}, 1));
    }

}
