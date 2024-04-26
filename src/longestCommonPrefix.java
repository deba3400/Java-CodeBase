public class longestCommonPrefix {

        public static String longestCommonPrefix(String[] strs) {
            String ans="";
            String min=strs[0];
            for(int i=1;i<strs.length;i++){
                if(strs[i].length()<min.length()){
                    min=strs[i];
                }
            }

            for(int i=0;i<min.length();i++){
                if(i>ans.length()){
                    break;
                }
                int count=1;
                for(int j=0;j<strs.length-1;j++){
                    if(strs[j].charAt(i)==strs[j+1].charAt(i)){
                        count=count+1;
                        if(count==strs.length){
                            ans=ans+strs[0].charAt(i);
                        }
                        else{
                            continue;
                        }
                    }
                    else{
                        break;
                    }
                }

            }
            return ans;

        }

    public static void main(String[] args) {
        String arr[]={"car","cir"};
        String ans=longestCommonPrefix(arr);
        System.out.println(ans);
    }

}
