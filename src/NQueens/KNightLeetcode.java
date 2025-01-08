//package NQueens;
//
//public class KNightLeetcode {
//    public static void main(String[] args) {
//        double ans =  knightProbability(4,4,0,0);
//        System.out.println(ans);
//
//    }
//        public static double knightProbability(int n, int k, int row, int column) {
//            boolean[][] board = new boolean[n][n];
//            double totalways = knight(board,row,column,k);
//
//            double probabilty = totalways/Math.pow(8,k);
//
//            return probabilty;
//        }
//
//    static double knight(boolean[][] board,int row,int col,int knights){
//        if(knights == 0){
//            return 1;
//        }
//
//        if(row == board.length -1 && col == board.length){
//            return 0;
//        }
//        double count = 0;
//
//        if(col == board.length){
//            count += knight(board,row+1,0,knights);
//        }
//
//
//        if (isSafe(board,row,col)){
//            board[row][col] = true;
//            count += knight(board,row,col+1,knights-1);
//            board[row][col] = false;
//        }
//
//         count += knight(board,row,col+1,knights);
//
//        return count;
//    }
//
//    private static boolean isSafe(boolean[][] board, int row, int col) {
//        if(isValid(board,row-2,col-1)){
//            if(board[row-2][col-1]){
//                return false;
//            }
//        }
//
//        if(isValid(board,row-2,col+1)){
//            if(board[row-2][col+1]){
//                return false;
//            }
//        }
//
//        if(isValid(board,row-1,col+2)){
//            if(board[row-1][col+2]){
//                return false;
//            }
//        }
//
//        if(isValid(board,row-1,col-2)){
//            if(board[row-1][col-2]){
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    //do not want to repeat yourself to check everytime for validity
//    static boolean isValid(boolean[][] board,int row,int col){
//        if(row>=0 && row < board.length && col >= 0 && col<board.length){
//            return true;
//        }
//
//        return false;
//    }
//
////    static void display(boolean[][] board){
////        for (boolean[] row : board){
////            for (boolean element:row){
////                if (element){
////                    System.out.print("K");
////                }else{
////                    System.out.print("X");
////                }
////            }
////            System.out.println();
////        }
////    }
//}
