public class Solution {
    public static int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        Region[][] region = new Region[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                region[i][j] = new Region(grid[i][j]);
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (region[i][j].isLand()) {
                    int area = calculate(region, i, j);

                    if (area > maxArea) maxArea = area;
                }
            }
        }

        return maxArea;
    }

    private static int calculate(Region[][] region, int row, int col) {
        // Check index boundaries
        if ((row < 0) || (col < 0)) return 0;
        if ((row >= region.length) || (col >= region[row].length)) return 0;
        // Check if we've already been here before
        if (region[row][col].isVisited()) return 0;

        // Record that we are here
        region[row][col].setVisited(true);

        // Water doesn't count
        if (!region[row][col].isLand()) return 0;
        // Recursively find more land for this island
        return 1 + calculate(region, row - 1, col) +    // Check top
                   calculate(region, row + 1, col) +    // Check bottom
                   calculate(region, row, col - 1) +    // Check left
                   calculate(region, row, col + 1);     // Check right
    }
}
