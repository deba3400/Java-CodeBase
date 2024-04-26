import java.util.HashMap;

public class majorityElement {
    public static void main(String[] args) {
        int nums[]={1,3,2,4,5,5,6,7,7,7,7};
        MajorityElementCheck(nums);
    }
    public static void MajorityElementCheck(int []nums){
        HashMap<Integer , Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);

            }
            else {
                map.put(nums[i],1);
            }
        }
        n=n/3;
        for(int key:map.keySet()){
            if(map.get(key)>n){
                System.out.println(key);
            }
        }



    }
}
