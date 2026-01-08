package hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordsTest {

    @Test
    void TestCountUniqueWordsReturn0() {
        assertEquals(0,UniqueWords.countUniqueWords(null));
        assertEquals(0,UniqueWords.countUniqueWords(""));
        assertEquals(0,UniqueWords.countUniqueWords("   "));
        assertEquals(0,UniqueWords.countUniqueWords("& / $$"));
        assertEquals(0,UniqueWords.countUniqueWords("\n \t"));
    }

    @Test
    void TestCountUniqueWordsReturn1() {
        assertEquals(1,UniqueWords.countUniqueWords("hello"));
        assertEquals(1,UniqueWords.countUniqueWords("123"));
        assertEquals(1,UniqueWords.countUniqueWords("   222"));
        assertEquals(1,UniqueWords.countUniqueWords("&/ $$ fff"));
        assertEquals(1,UniqueWords.countUniqueWords("\n word \t"));
    }

    @Test
    void TestCountUniqueWordsReturnAny() {
        assertEquals(4,UniqueWords.countUniqueWords("hello 1231 li 4"));
        assertEquals(2,UniqueWords.countUniqueWords("123 >< 333"));
        assertEquals(3,UniqueWords.countUniqueWords("333 _3334@ / $$ fff"));
    }
}