import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class MainTest {
    Main main = new Main();

    @Test
    public void testCheckPalindrome() {
        Boolean s = main.checkPalindrome(303031);
        assertEquals(s,false);

        Boolean s1 = main.checkPalindrome(30303);
        assertEquals(s1,true);

        Boolean s2 = main.checkPalindrome(0);
        assertEquals(s2,true);
    }

    @Test
    public void testPrintPattern() {
        String s = main.printPattern(4);
        assertEquals(s,"****\n***\n**\n*");

        String s1 = main.printPattern(1);
        assertEquals(s1,"*");

        String s2 = main.printPattern(0);
        assertEquals(s2,"");

        String s3 = main.printPattern(500);
        assertNotSame(s3,"");
    }

    @Test
    public void testCheckPrimeNumber() {
        Boolean p = main.checkPrimeNumber(401);
        assertEquals(p, true);
    }

    @Test
    public void testPrintFibonacciSeries() {
        String s = main.printFibonacciSeries(1);
        assertEquals(s, "0");

        String s1 = main.printFibonacciSeries(2);
        assertEquals(s1, "0 1");

        String s2 = main.printFibonacciSeries(3);
        assertEquals(s2, "0 1 1");

        String s3 = main.printFibonacciSeries(4);
        assertEquals(s3, "0 1 1 2");
    }

}
