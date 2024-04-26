import java.sql.SQLOutput;
import java.util.Arrays;
public class CycleSort {
    public static void main(String[] args) {
        int arr[]={8,7,3,2,3,2,1,4};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cycleSort(int arr[]){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else
                i++;

        }

    }

    public static void swap(int[] arr, int f, int end) {
        int temp=arr[f];
        arr[f]=arr[end];
        arr[end]=temp;
    }
}
