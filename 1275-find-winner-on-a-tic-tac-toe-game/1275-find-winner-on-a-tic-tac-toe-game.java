class Solution {
    public String tictactoe(int[][] moves) {
        char[][] board = new char[3][3];

        for(int i = 0; i < moves.length; i++) {
            int row = moves[i][0];
            int col = moves[i][1];
            
            if(i % 2 == 0) {
                board[row][col] = 'X'; // Player A
            } else {
                board[row][col] = 'O'; // Player B
            }
        }

        // Check Row
        for(int i = 0; i < 3; i++) {
            if(board[i][0] != '\0' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return board[i][0] == 'X' ? "A" : "B";
            }
        }

        // Check Column
        for(int i = 0; i < 3; i++) {
            if(board[0][i] != '\0' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return board[0][i] == 'X' ? "A" : "B";
            }
        }

        // Check Diagonal
        if(board[0][0] != '\0' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return board[0][0] == 'X' ? "A" : "B";
        }

        // Check Anti-Diagonal
        if(board[0][2] != '\0' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return board[0][2] == 'X' ? "A" : "B";
        }

        return moves.length == 9 ? "Draw" : "Pending";
    }
}