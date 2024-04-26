import java.util.HashMap;

public class findItenerary {
    public static String Start(HashMap<String , String > map1){

        HashMap<String, String> map2=new HashMap<>();// create a reverse hashmap to find the start
        for(String key:map1.keySet()){
            map2.put(map1.get(key),key);
        }
        for(String start:map1.keySet()){ // check which is present in map1's key state but in map2's key state
            if(!map2.containsKey(start)){
                return start;
            }
        }
   return null;
    }

    public static void main(String[] args) {
        HashMap <String ,String > map1=new HashMap<>();
        map1.put("chennai","bengaluru");
        map1.put("mumbai","delhi");
        map1.put("goa","chennai");
        map1.put("delhi","goa");
        String start= Start(map1);
        while(map1.containsKey(start)){
            System.out.print(start+"-->");
            start=map1.get(start);
        }
        System.out.print(start);



    }
}
