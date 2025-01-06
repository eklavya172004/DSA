package maze;

import java.util.Arrays;

public class MazePath {
    public static void main(String[] args) {

        boolean[][] board ={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        int[][] path = new int[board.length][board[0].length];

        pathObstaclePrint("",board,0,0,path,0);
    }
// now i am going and covering every path

    static void pathObstacle(String p,boolean[][] maze,int r, int c,int count){

        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        //I am considering this block in my path
//        int count = 0;
        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;

        if(r<maze.length-1){
//        pathObstacle(p +" R " + r + " C "+ c ,r-1,c);
            pathObstacle(p  +"D"+count,maze ,r+1,c,count+1);
        }
        if(c<maze[0].length-1){
//        pathS(p +" R "+ r +" C "+ c ,r,c-1);
            pathObstacle(p +"R"+count,maze ,r,c+1,count+1);
        }

        //up
        if(r>0){
//        pathS(p +" R "+ r +" C "+ c ,r,c-1);
            pathObstacle(p +"Up"+count,maze ,r-1,c,count+1);
        }

        //left
        if(c>0){
//        pathS(p +" R "+ r +" C "+ c ,r,c-1);
            pathObstacle(p +"left"+count,maze ,r,c-1,count+1);
        }

        //but when I am getting out of this call
        //this line is where the function will be over
        // so before the function gets removed also remove the changes that were made by the function
        maze[r][c] = true;
    }

    static void pathObstaclePrint(String p,boolean[][] maze,int r, int c,int[][] path,int step){

        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c] = step;
            for (int i = 0; i < path.length; i++) {
                System.out.println(Arrays.toString(path[i]));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        //I am considering this block in my path
//        int count = 0;
        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;
        path[r][c] = step;

        if(r<maze.length-1){
//        pathObstacle(p +" R " + r + " C "+ c ,r-1,c);
            pathObstaclePrint(p  +"D"+step,maze ,r+1,c,path,step+1);
        }
        if(c<maze[0].length-1){
//        pathS(p +" R "+ r +" C "+ c ,r,c-1);
            pathObstaclePrint(p +"R"+step,maze ,r,c+1,path,step+1);
        }

        //up
        if(r>0){
//        pathS(p +" R "+ r +" C "+ c ,r,c-1);
            pathObstaclePrint(p +"Up"+step,maze ,r-1,c,path,step+1);
        }

        //left
        if(c>0){
//        pathS(p +" R "+ r +" C "+ c ,r,c-1);
            pathObstaclePrint(p +"left"+step,maze ,r,c-1,path,step+1);
        }

        //but when I am getting out of this call
        //this line is where the function will be over
        // so before the function gets removed also remove the changes that were made by the function
        maze[r][c] = true;
        path[r][c] = 0;
    }

}
