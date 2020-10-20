import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Water Bottles")
public class SolutionTests {
    @Test
    void example1() {
        Assertions.assertEquals(13, Solution.numWaterBottles(9, 3));
    }

    @Test
    void example2() {
        Assertions.assertEquals(19, Solution.numWaterBottles(15, 4));
    }

    @Test
    void example3() {
        Assertions.assertEquals(6, Solution.numWaterBottles(5, 5));
    }

    @Test
    void example4() {
        Assertions.assertEquals(2, Solution.numWaterBottles(2, 3));
    }
}
