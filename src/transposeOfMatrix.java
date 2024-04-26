public class transposeOfMatrix {
    public static void main(String[] args) {
        int temp;
        int [][]arr={{2,4,5,3},
                     {3,4,4,5},
                     {6,5,8,9},
                     {6,7,9,0}};
//        for(int i=0;i<arr.length;i++)
//        {
//            for(int j=0;j<i;j++) {
//                temp = arr[i][j];
//                arr[i][j] = arr[j][i];
//                arr[j][i] = temp;
//            }
//            System.out.println();
//        }
//        for(int i=0;i<arr.length;i++)
//        {
//            for(int k=0;k<arr[0].length;k++)
//            {
//                System.out.print(" "+  arr[i][k]);
//            }
//            System.out.println();

        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < i; j++) {
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
        }
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr[0].length;j++)
                {
                   System.out.print(arr[i][j]);
                }
                System.out.println();
            }




//        for(int i=0;i<arr.length;i++) {
//            int left=0;
//            int right=arr[0].length-1;
//            while (left < right) {
//                temp = arr[i][left];
//                arr[i][left]=arr[i][right];
//                arr[i][right]=temp;
//                left++;
//                right--;
//
//            }
//        }
//        System.out.println();
//        for(int i=0;i<arr.length;i++)
//        {
//            for(int k=0;k<arr[0].length;k++)
//            {
//                System.out.print(" "+  arr[i][k]);
//            }
//            System.out.println();
//        }

    }
}
