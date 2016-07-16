package algorithms.ReverseVowelsofaString.java;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by fisbii on 16-7-15.
 */
public class ReverseVowelsStringTest {

    @Test
    public void testReverseVowels() throws Exception {
        ReverseVowelsString reverseVowelsString = new ReverseVowelsString();
        Assert.assertEquals("holle",reverseVowelsString.reverseVowels("hello"));
        Assert.assertEquals("leotcede",reverseVowelsString.reverseVowels("leetcode"));
    }
}