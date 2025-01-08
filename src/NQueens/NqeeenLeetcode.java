package NQueens;

import java.util.ArrayList;
import java.util.List;

public class NqeeenLeetcode {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        List<List<String>> ans = queen(board,0);
        System.out.println(ans);
    }
//    public List<List<String>> solveNQueens(int n) {
//
//    }

    public static List<List<String>> queen(boolean[][] board,int row){
        List<List<String>> queenlist = new ArrayList<>();
        if(row == board.length){
                queenlist.add(addinglist(board));
                return queenlist;
        }

        //placing the queen if its safe to place there
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board,row,col)){
                board[row][col] = true;
                List<List<String>> list = queen(board,row+1);
//                System.out.println();
                queenlist.addAll(list);
                board[row][col] = false;
            }
        }

        return queenlist;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        for (int i = 0; i < board.length; i++) {
            if(board[i][col]){
                return false;
            }
        }

        //check in the diagonal left
        int maxLeft = Math.min(row,col);

        for (int i = 1; i <= maxLeft ; i++) {
                if (board[row-i][col-i]){
                    return false;
                }
        }

        //check in diagonal right
        int maxRight = Math.min(row,board.length - col  -1);

        for (int i = 1; i <= maxRight; i++) {
            if (board[row-i][col+i]){
                return false;
            }
        }

        return true;

    }

    private static List<String> addinglist(boolean[][] board) {
//        ArrayList<String> list = new ArrayList<>();
        List<String> str = new ArrayList<>();
        String p = "";
        for (boolean[] row:board){
            for (boolean element:row){
                if(element){
                   p = p + "Q";
;                }else{
                    p = p + ".";
                }
            }
            str.add(p);
            p = "";
        }

        return str;
    }
}
