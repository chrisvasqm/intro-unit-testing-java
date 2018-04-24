import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MathTests {

    @Test
    public void add_TwoPlusTwo_ReturnsFour() {
        final int expected = 4;

        final int actual = Math.add(2, 2);

        assertEquals(actual, expected);
    }

    @Test
    public void divide_TenDividedByFive_ReturnsTwo() {
        final double expected = 2.0;

        final double actual = Math.divide(10, 5);

        assertEquals(actual, expected);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void divide_TenDividedByZero_ThrowsIllegalArgumentException() {
        Math.divide(10, 0);
    }

}
