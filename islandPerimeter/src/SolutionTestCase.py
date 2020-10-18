import unittest
from main import Solution


class MyTestCase(unittest.TestCase):
    def test_big(self):
        self.assertEqual(16, Solution.island_perimeter([[0, 1, 0, 0], [1, 1, 1, 0], [0, 1, 0, 0], [1, 1, 0, 0]]))

    def test_one(self):
        self.assertEqual(4, Solution.island_perimeter([[1]]))

    def test_two(self):
        self.assertEqual(4, Solution.island_perimeter([[1, 0]]))


if __name__ == '__main__':
    unittest.main()
