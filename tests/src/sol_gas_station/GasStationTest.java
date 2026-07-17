package sol_gas_station;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests for "gas-station" (Data Structures & Algorithms/gas-station/submission-0.java)
class GasStationTest {
    @Test
    void solvable() {
        assertEquals(3, new Solution().canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2}));
    }

    @Test
    void unsolvable() {
        assertEquals(-1, new Solution().canCompleteCircuit(new int[]{2,3,4}, new int[]{3,4,3}));
    }

}
