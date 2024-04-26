import java.util.Arrays;
public class SearchOnMatrix {
    public static void main(String[] args) {

        int matrix[][]={
                {10,20,30},
                {15,17,35},
                {16,18,45},

        };
        int  target=35;
        System.out.print( Arrays.toString(nSearch(matrix,target)));

    }
    static int[] nSearch(int [][]matrix,int target){
        int row=0;
        int col=matrix.length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                return new int []{row,col};
            }
            if (target > matrix[row][col]){
                row++;
            }
            else{
            col--;
        }
        }
        return new int[]{-1,-1};

    }
}
