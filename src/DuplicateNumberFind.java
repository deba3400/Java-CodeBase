import java.sql.SQLOutput;
import java.util.Arrays;
public class DuplicateNumberFind {
    public static void main(String[] args) {
        int arr[]={1,3,2,2,3,2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        find(arr);
    }
    public static void insertionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
//        find(arr);

        }
    public static void find(int arr[]){
           int count =0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
//                count++;
                System.out.println(arr[i]);
            }
        }

//        System.out.println(count);
    }

}

