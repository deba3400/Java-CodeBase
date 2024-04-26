
import java.util.Scanner;
public class subArrayDemo {
    public static void main(String[] args) {
        int []arr=new int[4];
        System.out.println("enter the array element");
        Scanner sc=new Scanner (System.in);
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();

        }
        for(int i=0;i<arr.length;i++)
        {
            for(int k=i;k<arr.length;k++)
            {
                for(int j=i;j<=k;j++)
                {
                    System.out.print(arr[j]);
                }
                System.out.println();
            }
        }
    }
}
