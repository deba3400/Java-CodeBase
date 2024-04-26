
import java.util.Scanner;
public class PatternPrint {
    public static void main(String[] args) {
//        Scanner sc=new Scanner();
//        System.out.println("enter the row :");
//        int n=sc.nextInt();
           pattern4(12);

    }
    public static void pattern1(int n){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i-1;j++) {
                System.out.print(" ");
            }
            for(int l=1;l<=2*(5-i)+1;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void pattern2(int n){
        for(int i=1;i<=2*n-1;i++){
            int totalcol=i>n?2*(2*n-i)-1:2*i-1;
            int space=i>n?i-n:n-i;
            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=totalcol;j++){


                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for(int i=1;i<=2*n-1;i++){
            int totalcol=i>n?2*(2*n-i)-1:2*i-1;
            int space=i>n?i-n:n-i;
            for(int k=1;k<=space;k++){
                System.out.print("_ ");
            }
            for(int j=1;j<=totalcol;j++){


                System.out.print(" ");
            }
            for(int j=1;j<=totalcol;j++){


                System.out.print(" ");
            }
            for(int k=1;k<=space;k++){
                System.out.print(" _");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print(" * ");
            }
            System.out.println();

        }
    }
    public static void pattern5(int n){
        for(int i=0;i<n;i++){
            for (int space=0;space<=i;space++)
                System.out.print(" ");
            for(int col=1;col<=n-i;col++){
                System.out.print(" *");
            }
            System.out.println();
        }

    }
    public static void pattern6(int n){
        for(int i=1;i<= 2*n-1;i++){
            int col=i>n?2*n-i:i;
            int space=i>n?n-i:n-col;
            for(int j=1;j<=col;j++){
                System.out.print("*");
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    public static void pattern7(int n){
        for(int i=1;i<= 2*n-1;i++){
            int col=i>n?2*n-i:i;
            int space=i>n?n-i:n-col;
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=col;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
