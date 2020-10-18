from typing import List


class Solution:

    def __init__(self):
        self.board = None
        self.row = None
        self.col = None

    def left(self) -> int:
        for i in range(self.col - 1, -1, -1):
            if self.board[self.row][i] == 'B':
                return 0
            elif self.board[self.row][i] == 'p':
                return 1

        return 0

    def right(self) -> int:
        for i in range(1, 8 - self.col):
            if self.board[self.row][self.col + i] == 'B':
                return 0
            elif self.board[self.row][self.col + i] == 'p':
                return 1

        return 0

    def up(self) -> int:
        for i in range(self.row - 1, -1, -1):
            if self.board[i][self.col] == 'B':
                return 0
            elif self.board[i][self.col] == 'p':
                return 1

        return 0

    def down(self) -> int:
        for i in range(1, 8 - self.row):
            if self.board[self.row + i][self.col] == 'B':
                return 0
            elif self.board[self.row + i][self.col] == 'p':
                return 1

        return 0

    def num_rook_captures(self, board: List[List[str]]) -> int:
        self.board = board
        self.row = 0
        self.col = 0

        for i in range(8):
            try:
                self.col = self.board[i].index('R')
            except ValueError:
                continue
            else:
                self.row = i
                break

        return self.left() + self.up() + self.right() + self.down()

