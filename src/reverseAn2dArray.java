public class reverseAn2dArray {
    public static void main(String[] args) {
        int [][]arr={{2,3,45,5},{5,6,434,3},{3,5,4,2},{4,4,5,5}};
        int temp;


        for(int i=0;i<arr.length;i++) {
            int left=0;
            int right=arr[0].length-1;
            while (left < right) {
                temp = arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;
                left++;
                right--;

            }
        }
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            for(int k=0;k<arr[0].length;k++)
            {
                System.out.print(" "+  arr[i][k]);
            }
            System.out.println();
        }
    }
}
