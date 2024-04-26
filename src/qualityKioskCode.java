public class qualityKioskCode {
    public static int Check(int []A,int N){
        int sum=0;
        int max=A[0];
        for(int i=1;i<N;i++){
            if(max<A[i]){
                max=A[i];
            }
        }
        for(int j=0;j<N;j++){
            sum=sum+A[j];
        }

        if(sum==max*N){
           return 0;
        }
        else{
            sum=max*N-sum;
        }
        return sum;

    }

 public static void main(String[] args) {
        int A[]={4,2,1,3};
        int N=4;
        System.out.println(Check(A,N));
    }
}
