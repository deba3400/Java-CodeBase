public class max {
    public static void main(String args[])
    {
        int [] arr={2,4,8,5,9,34,7,45};
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];

        }
        System.out.println(max);


    }
}
