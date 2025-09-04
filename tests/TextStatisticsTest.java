import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TextStatisticsTest {
    final String toBe = "to be or not to be";

    @Test
    void wordCount_NormalCase() {
        assertEquals(6, TextStatistics.wordCount(toBe), "wrong number of words calculated by wordCount");
    }
}