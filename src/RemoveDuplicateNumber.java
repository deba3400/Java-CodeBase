import java.sql.SQLOutput;

public class RemoveDuplicateNumber {
    public static void main(String[] args) {
        int nums[] = {0, 0, 1, 1, 2, 3,3,3,4,5,6};
         removeDuplicates( nums);


    }


    public static void removeDuplicates(int[] nums) {
        int j = 1;
        int n=nums.length-1;
        for (int i = 0; i <= n-1; i++) {
            if (nums[i] != nums[i +1]) {
                nums[j] = nums[i];
                System.out.print("  " + nums[j]);
                j++;
            }
        }
        if(nums[n]!=nums[n-1]){
            System.out.println(" "+nums[n]);
        }






    }
}

