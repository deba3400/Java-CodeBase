public class LinearSearch {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8};
        int target=6;
        int ans=linearSearch(arr,target);
        System.out.println(ans);

    }
    static int linearSearch(int [] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                return i;

            }
        }
        return -1;
    }
}
