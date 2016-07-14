package algorithms.reversestring.src;

import static org.junit.Assert.*;

/**
 * Created by fisbii on 16-7-13.
 */
public class ReverseStringTest {

    @org.junit.Test
    public void testReverseString() throws Exception {
        assertEquals("olleH", ReverseString.reverseString("Hello"));
        assertEquals("Hello World!",ReverseString.reverseString(ReverseString.reverseString("Hello World!")));
    }
}