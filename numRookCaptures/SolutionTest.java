import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Rook Captures")
public class SolutionTest {
    @Test
    void example1() {
        Solution solution = new Solution();
        Assertions.assertEquals(3, solution.numRookCaptures(new char[][]
                       {{'.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', 'p', '.', '.', '.', '.'},
                        {'.', '.', '.', 'R', '.', '.', '.', 'p'},
                        {'.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', 'p', '.', '.', '.', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.'}}));
    }

    @Test
    void example2() {
        Solution solution = new Solution();
        Assertions.assertEquals(0, solution.numRookCaptures(new char[][]
                       {{'.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'},
                        {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'},
                        {'.', 'p', 'B', 'R', 'B', 'p', '.', '.'},
                        {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'},
                        {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.'}}));
    }

    @Test
    void example3() {
        Solution solution = new Solution();
        Assertions.assertEquals(3, solution.numRookCaptures(new char[][]
                       {{'.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', 'p', '.', '.', '.', '.'},
                        {'.', '.', '.', 'p', '.', '.', '.', '.'},
                        {'p', 'p', '.', 'R', '.', 'p', 'B', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', 'B', '.', '.', '.', '.'},
                        {'.', '.', '.', 'p', '.', '.', '.', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.'}}));
    }
}
