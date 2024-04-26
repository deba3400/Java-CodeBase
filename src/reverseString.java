public class reverseString {
    public static void main(String[] args) {
        String str="i am debashis";
        String rev="";

        String [] arr=str.split(" ");
//        char c[]=str.toCharArray();

        int n=arr.length-1;
        for(int i=n;i>=0;i--)
        {

            rev= rev  + arr[i] +" ";
//           System.out.print(c[i]);

        }

        System.out.print(rev);
//          return(arr);
    }
}
