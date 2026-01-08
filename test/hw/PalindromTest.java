package hw;

import static hw.Palindrom.isPalindrom;
import static org.junit.jupiter.api.Assertions.*;

class PalindromTest {

    @org.junit.jupiter.api.Test
    void testIsPalindrom() {
        assertFalse(isPalindrom( "ab"));
        assertTrue(isPalindrom(" aa "));
        assertTrue(isPalindrom(" aa "));
        assertTrue(isPalindrom("ss ss"));
        assertTrue(isPalindrom("ss ss  "));
        assertTrue(isPalindrom("1"));
        assertTrue(isPalindrom("dad"));
        assertFalse(isPalindrom(" "));
        assertFalse(isPalindrom(null));

    }
}