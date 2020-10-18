from typing import List


class Solution:
    @staticmethod
    def island_perimeter(grid: List[List[int]]) -> int:
        edges: int = 0

        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] == 1:
                    edges += 4
                    edges -= 2 if i > 0 and grid[i -1][j] == 1 else 0
                    edges -= 2 if j > 0 and grid[i][j-1] == 1 else 0

        return edges

