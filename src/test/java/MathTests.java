import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MathTests {

    @Test
    public void sum_TwoPlusTwo_ReturnsFour() {
        final int expected = 4;

        final int actual = Math.add(2, 2);

        assertEquals(actual, expected);
    }

}
