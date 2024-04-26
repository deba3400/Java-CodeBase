
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
        // creating ArrayList


        ArrayList<Integer> list =new ArrayList<>(10);


        // creating an array
        int [] arr={3,26,4,5,7};


        // add value into Arraylist


        list.add(10);
        list.add(78);
        list.add(45);
        System.out.println(list);


        // add at index
        list.add(2,90);
        System.out.println(list);


        //get(is use to print particular index element )
       System.out.println( list.get(2));
        // set is used to add value to the particular index deleting old value
        list.set(1,45);
        System.out.println( list.get(1));
        System.out.println(list);

        // remove is used to remove element
        list.remove(3);
        System.out.println(list);
        list.add(12);
        list.add(11);
        list.add(13);
        System.out.println(list);
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);

        }

   Collections.sort(list);
        System.out.println(list);



    }
}
