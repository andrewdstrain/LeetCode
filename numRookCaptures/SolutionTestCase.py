import unittest
from Solution import Solution


class SolutionTestCase(unittest.TestCase):
    def test_example1(self):
        sol = Solution()
        self.assertEqual(3, sol.num_rook_captures([[".",".",".",".",".",".",".","."],
                                                   [".",".",".","p",".",".",".","."],
                                                   [".",".",".","R",".",".",".","p"],
                                                   [".",".",".",".",".",".",".","."],
                                                   [".",".",".",".",".",".",".","."],
                                                   [".",".",".","p",".",".",".","."],
                                                   [".",".",".",".",".",".",".","."],
                                                   [".",".",".",".",".",".",".","."]]))

    def test_example2(self):
        sol = Solution()
        self.assertEqual(0, sol.num_rook_captures([[".",".",".",".",".",".",".","."],
                                                   [".","p","p","p","p","p",".","."],
                                                   [".","p","p","B","p","p",".","."],
                                                   [".","p","B","R","B","p",".","."],
                                                   [".","p","p","B","p","p",".","."],
                                                   [".","p","p","p","p","p",".","."],
                                                   [".",".",".",".",".",".",".","."],
                                                   [".",".",".",".",".",".",".","."]]))

    def test_example3(self):
        sol = Solution()
        self.assertEqual(3, sol.num_rook_captures([[".",".",".",".",".",".",".","."],
                                                   [".",".",".","p",".",".",".","."],
                                                   [".",".",".","p",".",".",".","."],
                                                   ["p","p",".","R",".","p","B","."],
                                                   [".",".",".",".",".",".",".","."],
                                                   [".",".",".","B",".",".",".","."],
                                                   [".",".",".","p",".",".",".","."],
                                                   [".",".",".",".",".",".",".","."]]))


if __name__ == '__main__':
    unittest.main()
