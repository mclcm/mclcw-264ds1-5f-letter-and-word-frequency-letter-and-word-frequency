import java.util.Scanner;

/**
 * Various utility methods for calculating statistics about words in text
 */
public class TextStatistics {
    /**
     * Count the number of words in text
     * @param text The text to scan
     * @return number of words
     * TODO: any edge cases to handle?
     */
    static int wordCount(String text) {
        int numWords = 0;
        Scanner sc = new Scanner(text);

        do {
            numWords++;
            sc.next();
        } while (sc.hasNext());
        return numWords;
    }

    // TODO implement all other methods here

}
