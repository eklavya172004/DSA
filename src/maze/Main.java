package maze;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> list = pathSA("",3,3);
//        System.out.print(list);

        boolean[][] board ={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };

        pathSA("",3,7);
    }

    static int path(int r, int c){
        if(r==1 || c==1){

            return 1;
        }

        int left = path(r-1,c);
        int right = path(r,c-1);

        return left + right;
    }

    static void pathS(String p,int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return ;
        }
        if(r>1){
//        pathS(p +" R " + r + " C "+ c ,r-1,c);
            pathS(p  +" D" ,r-1,c);
        }
        if(c>1){
//        pathS(p +" R "+ r +" C "+ c ,r,c-1);
            pathS(p +" R " ,r,c-1);
        }
    }

    static ArrayList<String> pathSA(String p, int r, int c){
        if(r==1 && c==1){
        ArrayList<String> list = new ArrayList<>();
            System.out.println(p);
            list.add(p);
            return list;
        }

        ArrayList<String> listfrombelow = new ArrayList<>();

        if(r>1){
//        pathS(p +" R " + r + " C "+ c ,r-1,c);
//            ArrayList left = pathSA(p  +" D" ,r-1,c);
            listfrombelow.addAll(pathSA(p  +"D" ,r-1,c));
        }
        if(c>1){
//        pathS(p +" R "+ r +" C "+ c ,r,c-1);
//            ArrayList right = pathSA(p +" R " ,r,c-1);
            listfrombelow.addAll( pathSA(p +"R" ,r,c-1));
        }
        if(r>1 && c>1){
            listfrombelow.addAll(pathSA(p+"C",r-1,c-1));
        }

        return listfrombelow;
    }

    static void pathObstacle(String p,boolean[][] maze,int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
//        int count = 0;
        if(!maze[r][c]){
            return;
        }

        if(r<maze.length-1){
//        pathObstacle(p +" R " + r + " C "+ c ,r-1,c);
            pathObstacle(p  +"D",maze ,r+1,c);
        }
        if(c<maze[0].length-1){
//        pathS(p +" R "+ r +" C "+ c ,r,c-1);
            pathObstacle(p +"R",maze ,r,c+1);
        }
    }
}
