import java.sql.SQLOutput;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        bubbleSort(arr);
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);

        }

    }
    public static int[] bubbleSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<=n-1;i++){
            boolean swap=false;
            for(int j=1;j<=n-i-1;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }

    return arr;
    }
}
