import java.util.Scanner;
public class check {
    public static void main(String[] args) {
        int a,b,c,max;
        System.out.println("enter the three number:");
        Scanner cs=new Scanner(System.in);
        a=cs.nextInt();
        b=cs.nextInt();
        c=cs.nextInt();
        max=(a>b&&a>c)?a:(b>c)?b:c;
        System.out.print(max);



    }
}
