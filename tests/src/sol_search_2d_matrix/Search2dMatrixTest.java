package sol_search_2d_matrix;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests for "search-2d-matrix" (Data Structures & Algorithms/search-2d-matrix/submission-0.java)
class Search2dMatrixTest {
    @Test
    void found() {
        assertTrue(new Solution().searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 3));
    }

    @Test
    void notFound() {
        assertFalse(new Solution().searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 13));
    }

}
