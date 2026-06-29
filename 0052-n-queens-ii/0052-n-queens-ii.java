class Solution {
    public int totalNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        nQueen(board, 0, n, res);
        return res.size();
    }
     public static boolean isSafe(char[][] board, int row, int col, int n) {
        // vert 
        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q')
                return false;
        }
        // left dia
        for (int i = row, j = col; i>=0 && j >= 0 ; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        // right dia
        for (int i = row, j= col; i>=0 && j < n; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }
        return true;
    }

    public static void nQueen(char[][] board, int row, int n, List<List<String>> res) {
        if (row == n) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }
            res.add(temp);
            return; 
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 'Q';
                nQueen(board , row +1 , n , res);
                board[row][col] = '.';
            }
        }
    }
  
}