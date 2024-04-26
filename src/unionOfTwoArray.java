import java.util.HashSet;

public class unionOfTwoArray {
    public static void UnionOfTwoArray( int []arr1,int []arr2)
    {
        int n1=arr1.length;
        int n2=arr2.length;
        HashSet<Integer> set =new HashSet<>();
        for(int i=0;i<n1;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<n2;i++){
            set.add(arr2[i]);
        }
        System.out.println(set.size());

    }
    public static int Intersection(int [] arr1, int [] arr2){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        int count=0;
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                count++;
                System.out.print(arr2[i]);
                set.remove(arr2[i]);
            }
            System.out.println();
        }
        return count;

    }


    public static void main(String[] args) {
        int arr1[]={1,2,3,6,7};
        int arr2[]={3,5,8,2,1,9,10};
//        UnionOfTwoArray(arr1,arr2);
        System.out.println( Intersection(arr1,arr2));
    }
}
