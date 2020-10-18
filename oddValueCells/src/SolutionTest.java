import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("OddValueCells")
public class SolutionTest {
    private Solution solution;

    @BeforeEach
    void beforeEach() {
        solution = new Solution();
    }

    @Test
    void example1() {
        int n = 2;
        int m = 3;
        int[][] indices = {{0, 1}, {1, 1}};

        Assertions.assertEquals(6, solution.oddCells(n, m, indices));
    }

    @Test
    void example2() {
        int n = 2;
        int m = 2;
        int[][] indices = {{1, 1}, {0, 0}};

        Assertions.assertEquals(0, solution.oddCells(n, m, indices));
    }
}
