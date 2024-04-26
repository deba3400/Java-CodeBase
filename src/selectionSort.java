import java.util.Scanner;
public class selectionSort {
    public static void main(String[] args) {
        int n = 0;

        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE ARRAY SIZE:");
        if(sc.hasNextInt())
        {
            n=sc.nextInt();
        }
        int []arr = new int[n];
        System.out.println("enter the array element:");
        for(int i=0;i<n;i++){

                arr[i] = sc.nextInt();

        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    j++;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }

    }
}
