import java.util.Arrays;

public class Solution {
    private char[][] board;
    private int row;
    private  int col;

    private int left() {
        for (int i = col - 1; i >= 0; i--) {
            if (board[row][i] == 'B') return 0;
            if (board[row][i] == 'p') return 1;
        }

        return 0;
    }

    private int right() {
        for (int i = 1; i < 8 - col; i++) {
            if (board[row][col + i] == 'B') return 0;
            if (board[row][col + i] == 'p') return 1;
        }

        return 0;
    }

    private int up() {
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'B') return 0;
            if (board[i][col] == 'p') return 1;
        }

        return 0;
    }

    private int down() {
        for (int i = 1; i < 8 - row; i++) {
            if (board[row + i][col] == 'B') return 0;
            if (board[row + i][col] == 'p') return 1;
        }

        return 0;
    }

    private int index(char[] chars, char ch) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ch) return i;
        }

        return -1;
    }

    public int numRookCaptures(char[][] board) {
        this.board = board;

        for (int i = 0; i < 8; i++) {
            col = index(board[i], 'R');
            if (col < 0) continue;
            row = i;
            break;
        }

        return left() + up() + right() + down();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int r = sol.numRookCaptures(new char[][] {{'.','.','.','.','.','.','.','.'},{'.','.','.','.','p','.','p','.'},{'.','p','.','.','.','.','.','.'},{'.','p','B','.','R','.','B','p'},{'.','p','.','.','.','B','.','.'},{'.','.','p','.','.','p','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'}});
        System.out.println(r);
    }
}
