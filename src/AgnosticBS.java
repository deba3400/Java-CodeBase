import java.sql.SQLOutput;

public class AgnosticBS {
    public static void main(String[] args) {
        int arr[]={1,4,8,9,20,50,60};
        int target=50;
        int ans=agnosticBS(arr,target);
        System.out.println(ans);

    }

    static int agnosticBS(int []arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        boolean isASC;
        if(arr[start]<arr[end]){
            isASC=true;
    }
        else{
            isASC=false;
        }
        while(start<=end){
            int mid;
            mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isASC){
                if(target<arr[mid])
                    end=mid-1;
                else
                    start=mid+1;
            }
            else {
                if(target<arr[mid])
                    start=mid+1;
                else
                    end=mid-1;

            }

        }
        return -1;

    }

}
