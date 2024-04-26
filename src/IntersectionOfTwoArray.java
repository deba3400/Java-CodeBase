import java.util.*;
public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int arr1[]={1,3,4,4,6,9};
        int arr2[]={2,5,5,6,9,4,4};
        System.out.println(Intersection(arr1,arr2));

    }
    public static int Intersection(int []arr1,int arr2[]){
        HashSet <Integer > set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        System.out.println(set);
        int count=0;
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                System.out.println(arr2[i]);
                count++;
                set.remove(arr2[i]);
                System.out.println(set);
            }

        }
        return count;
    }
}
//class IntersectionOfTwoArray {
//    public static void main(String[] args) {
//        int arr1[]={1,2,4,5,6,7};
//        int arr2[]={4,5,7};
//        System.out.println(intersect(arr1,arr2));
//    }
//    public static int[] intersect(int[] nums1, int[] nums2) {
//        List <Integer> list1=new ArrayList<>();
//        List<Integer> list=new ArrayList<>();
//        for(int i=0;i<nums1.length;i++){
//            list1.add(nums1[i]);
//        }
//        for(int j=0;j<nums2.length;j++){
//            if(list1.contains(nums2[j])){
//                list.add(nums2[j]);
//                list1.remove(nums2[j]);
//            }
//        }
//        int arr[]=new int[list.size()];
//        for(int i=0;i<list.size();i++){
//            arr[i]=list.get(i);
//        }
//        return arr ;
//
//    }
//}
