import java.util.Scanner;
public class findMaxMin {
    public static void main(String[] args) {
        int []arr={9,4,3,5,6,7};
        MaxMin(arr);

    }
    public static void MaxMin(int []arr){
       int max;

        int  min=max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
            else
                if(arr[i]<min)
                    min=arr[i];
        }
        System.out.println(max);
        System.out.println(min);
    }
}
