import java.util.*;
public class anagram {
    public static void main(String[] args) {
        String str= "debashis";
        String str1="shisdeba";
        System.out.println(check(str,str1));


    }
    public static boolean check(String str,String str1){
        if (str.length() != str1.length()) {
            return false;
        }

        HashMap <Character,Integer> map= new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i),1);
            }
        }
        for(int i=0;i<str1.length();i++){
            if(!map.containsKey(str1.charAt(i))){
                return false;
            }
            if(map.containsKey(str1.charAt(i))){
                map.put(str1.charAt(i),map.get(str1.charAt(i))-1);
            }
            if(map.get(str1.charAt(i))==0){
                map.remove(str1.charAt(i));
            }

        }

        return map.size()==0;
    }
}
