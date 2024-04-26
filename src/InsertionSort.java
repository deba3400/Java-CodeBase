public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={5,3,4,1,2};
        int n=arr.length;
        for(int i=0;i<arr.length-1;i++){
//            boolean swapped=false;
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
//                    swapped=true;
                }
                else
                    break;
            }

        }
        for(int i=0;i<=arr.length-1;i++) {
            System.out.println(arr[i]);
        }
    }
}
