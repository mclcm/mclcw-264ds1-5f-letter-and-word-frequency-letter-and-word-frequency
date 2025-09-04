import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Learning how to create simple unit tests
 */
class MainTest {

    @Test
    void myMethodShouldAddOne_normalTest() {
        // arrange a test for a normal case of using the myMethodShouldAddOne() method
        Main main = new Main();
        long testNumber = 89;

        // act
        long numberReturned = main.myMethodShouldAddOne(testNumber);

        // assert
        assertEquals(testNumber + 1, numberReturned, "Failure to handle normal case");
    }

    /**
     * This test should ensure that the myMethodShouldAddOne() method provides the desired
     * or otherwise reasonable behaviour for a boundary/edge condition of maximum value
     * TODO: make sure this test is really working - test the test :-)
     */
    @Test
    void myMethodShouldAddOne_MaxIntTest() {
        // arrange a test for a boundary/edge case of using the myMethodShouldAddOne() method
        Main main = new Main();
        long testNumber = Long.MAX_VALUE;

        // act
        long numberReturned = main.myMethodShouldAddOne(testNumber);

        // assert
        assertEquals(testNumber + 1, numberReturned, "Failure to handle MaxInt case");
    }
}