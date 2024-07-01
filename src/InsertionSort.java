public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={4,5,1,3,2,12,45,23,45,56,345};
        int n=arr.length;
        insertionSort(arr);
        for(int i=0;i<=n-1;i++){
            System.out.println(arr[i]);
        }

    }
    public static int[] insertionSort(int arr[]){
        int n=arr.length;
        for(int i=1;i<=n-1;i++){
            for(int j=i;j>=1;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else{
                    break;
                }
            }
        }
        return arr;
    }
}
