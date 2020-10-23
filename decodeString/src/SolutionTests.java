import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Decode String")
class SolutionTests {
    Solution solution;

    @BeforeEach
    void beforeEach() {
        solution = new Solution();
    }

    @Test
    void example1() {
        assertEquals("aaabcbc", solution.decodeString("3[a]2[bc]"));
    }

    @Test
    void example2() {
        assertEquals("accaccacc", solution.decodeString("3[a2[c]]"));
    }

    @Test
    void example3() {
        assertEquals("abcabccdcdcdef", solution.decodeString("2[abc]3[cd]ef"));
    }

    @Test
    void example4() {
        assertEquals("abccdcdcdxyz", solution.decodeString("abc3[cd]xyz"));
    }

    @Test
    void example5() {
        assertEquals("E".repeat(100), solution.decodeString("100[E]"));
    }
}