import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Find Town Judge")
public class SolutionTests {
    @Test
    void example1() {
        Assertions.assertEquals(2, Solution.findJudge(2, new int[][] {{1,2}}));
    }

    @Test
    void example2() {
        Assertions.assertEquals(3, Solution.findJudge(3, new int[][] {{1,3}, {2,3}}));
    }

    @Test
    void example3() {
        Assertions.assertEquals(-1, Solution.findJudge(3, new int[][] {{1,3}, {2,3}, {3,1}}));
    }

    @Test
    void example4() {
        Assertions.assertEquals(-1, Solution.findJudge(3, new int[][] {{1,2}, {2,3}}));
    }

    @Test
    void example5() {
        Assertions.assertEquals(3, Solution.findJudge(4, new int[][] {{1,3}, {1,4},{2,3},{2,4},{4,3}}));
    }
}
