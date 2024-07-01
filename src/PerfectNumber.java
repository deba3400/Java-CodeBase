public class PerfectNumber {

    public static boolean perfectNumberFind(int num){
        int sum=0;
        for(int i=2;i<= num/2;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        return sum+1==num;
    }

    public static void main(String[] args) {
        int num=6;
       System.out.println(perfectNumberFind(8128));

    }

}
