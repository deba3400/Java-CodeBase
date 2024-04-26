import java.sql.SQLOutput;
import java.util.*;

public class passArrayThroughSet{
    public static Set<Integer> Convert(int [] Array){
        Set<Integer> set=new HashSet<>();
        for(int val:Array){
            set.add(val);
        }
        return set;
    }
    public static void main(String[] args) {
            int array[]={1,2,3,4,5,5,6};
            Set<Integer> set=Convert(array);
        System.out.println(set);
    }
}
