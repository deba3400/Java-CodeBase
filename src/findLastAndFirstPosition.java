public class findLastAndFirstPosition {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,5};
        System.out.println(FindPosition(arr,6));

    }
    public static int[] FindPosition(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                if(arr[mid]==arr[mid+1]){
                    return new int[]{mid ,mid+1};
                }
                else{
                    return new int[]{mid,mid-1};
                }
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}
