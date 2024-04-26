import java.io.*;
public class BitCount {
    public static void main(String[] args) {
        int arr[]={0,5,10};
        int k=2;
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            if (Integer.bitCount(arr[i]) == k) {
                sum = sum+arr[i];
            }

        }
        System.out.println(sum);
//        String name="debashis is a good boy";
//        char[] C=name.toCharArray();
//        for(int i=0;i<C.length;i++) {
//
//              if ((C[i] != '\0' && i==0) || (  C[i] != '\0' && C[i-1]=='\0'))
//              {
//                System.out.println(C[i]);
//            }
//
//
//        }
    }
}
