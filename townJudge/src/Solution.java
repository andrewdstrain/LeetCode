import java.util.Arrays;

public class Solution {
    public static int findJudge(int N, int[][] trust) {
        int[] trusts = new int[N];
        int[] trusted = new int[N];
        Arrays.fill(trusts, 0);
        Arrays.fill(trusted, 0);

        for (int[] num : trust) {
            trusts[num[0] - 1]++;
            trusted[num[1] - 1]++;
        }

        for (int i = 0; i < N; i++) {
            if ((trusts[i] == 0) && (trusted[i] == N - 1)) {
                return i + 1;
            }
        }

        return -1;
    }
}
