public class Solution {
    public static int numWaterBottles(int numBottles, int numExchange) {
        return new ExchangeBottles(numBottles, numExchange).calculate();
    }
}
