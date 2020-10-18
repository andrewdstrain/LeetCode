import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Solution Test")
public class SolutionTest {
    @Test
    void big() {
        assertEquals(16, Solution.islandPerimeter(new int[][] {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}}));
    }

    @Test
    void one() {
        assertEquals(4, Solution.islandPerimeter(new int[][] {{1}}));
    }

    @Test
    void two() {
        assertEquals(4, Solution.islandPerimeter(new int[][] {{1, 0}}));
    }
}
