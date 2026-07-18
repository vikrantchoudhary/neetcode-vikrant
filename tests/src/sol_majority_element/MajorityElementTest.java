package sol_majority_element;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests for "majority-element" (Data Structures & Algorithms/majority-element/submission-0.java)
class MajorityElementTest {
    @Test
    void caseA() {
        assertEquals(3, new Solution().majorityElement(new int[]{3,2,3}));
    }

    @Test
    void caseB() {
        assertEquals(2, new Solution().majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

}
