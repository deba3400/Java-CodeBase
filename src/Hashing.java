import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String[] args) {
        // create a HashSet
//        HashSet<Integer> set=new HashSet<>();
        // insert into hashSet
        //time complexity to insert is O(1)....HashSet does not contains duplicate  value
//        set.add(1);
//        set.add(4);
//        set.add(3);
//        set.add(2);
//        set.add(1);
//        System.out.println(set);// print HashSet
//        // search in HashSet
//        if(set.contains(1)){
//            System.out.println("HashSet contains 1");
//        }
//        else {
//            System.out.println("does not contains 1");
//        }
//        if(!set.contains(6)){
//            System.out.println("hashSet not contains 6");
//        }
//  // how to remove element
//        set.remove(1);
//        if(!set.contains(1)){
//            System.out.println(" element 1 is deleted");
//        }else
//            System.out.println("1 is not deleted atall");
//
        // size of HashSet
//        System.out.println("the size of HashSet is :"+ set.size());



        // Iterator---> to traverse HashSet
//        Iterator it= set.iterator();
//        while(it.hasNext()){//check there is element or not...if any retrun true
//            System.out.println(it.next());// it.next print next element
//        }

        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
        if(sc.hasNextInt()){
            System.out.println("ture");
        }
        else {
            System.out.println("false");
        }
    }
}
