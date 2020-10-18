import java.util.Arrays;

public class Solution {
    int[][] matrix;

    private void zeroFill(int n, int m) {
        matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            Arrays.fill(matrix[i], 0);
        }
    }

    public int oddCells(int n, int m, int[][] indices) {
        int odds = 0;

        zeroFill(n, m);

        for (int i = 0; i < indices.length; i++) {
            // Row
            for (int j = 0; j < m; j++) {
                matrix[indices[i][0]][j] += 1;
                odds += matrix[indices[i][0]][j] % 2 == 0 ? -1 : 1;
            }

            // Column
            for (int j = 0; j < n; j++) {
                matrix[j][indices[i][1]] += 1;
                odds += matrix[j][indices[i][1]] % 2 == 0 ? -1 : 1;
            }
        }

        return odds;
    }
}
