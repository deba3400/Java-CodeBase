import java.util.ArrayList;
public class evenRemove {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(3);
        list.add(11);
        list.add(13);
        list.add(20);
        System.out.println(list);
//        for(int i=0;i<list.size();i++){
        for(int i=list.size()-1;i>=0;i++){
            if(list.get(i)%2==0)
            {
                list.remove(i);
            }

        }
        System.out.print(list);


    }
}
