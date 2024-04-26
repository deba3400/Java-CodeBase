public class binarySearchOn2dMatrix {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(binarySearch(matrix,5));
    }
    public static boolean binarySearch(int[][] Matrix,int target){
        int m=Matrix.length;
        int n=Matrix[0].length;
        int low=0;
        int high=m*n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int row=mid/n;
            int col=mid%n;
            if(Matrix[row][col]==target){
                return true;
            }
            else if(Matrix[row][col]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
}
