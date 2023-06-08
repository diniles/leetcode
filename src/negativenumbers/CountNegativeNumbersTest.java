package negativenumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountNegativeNumbersTest {

    @Test
    public void tests() {
        assertEquals(8, CountNegativeNumbers.countNegatives(new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}}));
        assertEquals(0, CountNegativeNumbers.countNegatives(new int[][]{{3, 2}, {1, 0}}));

    }
}