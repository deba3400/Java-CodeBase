
import java.util.*;
public class removeVowels {
    public static void main(String[] args) {
        String st="youcando";
        Check(st);


    }

//    public static void remove(String st){
//        for (int i=0;i<st.length();i++){
//            char ch = st.charAt(i);
//
//            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
//                continue;
//            }
//           System.out.print(ch);
//
//        }
//    }
  public static void Check(String st){
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='u'||ch=='o')
            {
               continue;
            }
            System.out.print(ch);
        }



  }
}
