
import java.util.Scanner;
public class subArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
//        System.out.println(n);
//        Scanner sc= new Scanner(System.in);
        for (int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                for(int k=i;k<=j;k++) {
                    System.out.print("  "+ arr[k]);

                }
                System.out.println();
            }
        }

    }
}