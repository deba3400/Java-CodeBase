import java.lang.Character;
public class CheckCases {
    public static void main(String[] args) {
        String str="DebashiS";
        char c[]=str.toCharArray();
        for(int i=0;i<c.length;i++){
//            char s=c[i];
            if (Character.isUpperCase(c[i])) {
                System.out.println(c[i]);
            }

        }
    }
}
