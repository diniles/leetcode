package arrays101.maxConsecutiveOnes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution sol = new Solution();

    @Test
    public void test1() {
        assertEquals(3, sol.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
    }

    @Test
    public void test2() {
        assertEquals(2, sol.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1}));
    }

    @Test
    public void test3() {
        assertEquals(1, sol.findMaxConsecutiveOnes(new int[]{1}));
    }

    @Test
    public void test4() {
        assertEquals(0, sol.findMaxConsecutiveOnes(new int[]{0}));
    }

    public void test5() {
        assertEquals(0, sol.findMaxConsecutiveOnes(new int[]{0, 0}));
    }
}