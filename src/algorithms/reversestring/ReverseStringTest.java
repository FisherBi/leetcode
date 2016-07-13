package algorithms.reversestring;

import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by fisbii on 16-7-13.
 */
public class ReverseStringTest {

    @org.junit.Test
    public void testReverseString() throws Exception {
        Assert.assertEquals("olleH", ReverseString.reverseString("Hello"));
        Assert.assertEquals("Hello World!",ReverseString.reverseString(ReverseString.reverseString("Hello World!")));
    }
}