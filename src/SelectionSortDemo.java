import java.sql.SQLOutput;

public class SelectionSortDemo {
    public static void main(String[] args) {
        int arr[]={0,0,0,0,0,0,0};
        check(arr);
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(" "+arr[i]);
        }
//        System.out.println(arr1);


    }
    public static int[] check(int []arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<=n-1;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        return arr;

    }
}