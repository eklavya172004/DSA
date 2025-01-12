package RecursionPractice;

public class Pattern {
    public static void main(String[] args) {
        Pattern(4,0)
;    }

    static void Pattern(int row,int col){

        if(row == 0){
            return;
        }

        if(row>col){
            System.out.print("*");
            Pattern(row,col+1);
        }else{
            System.out.println();
            Pattern(row-1,0);
        }

    }
}
