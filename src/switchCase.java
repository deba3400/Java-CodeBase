import java.util.Scanner;
public class switchCase {
    public static void main(String[] args) {
        System.out.println("enter the name of relation");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        switch (name) {
            case "saraswati" -> System.out.println("this is sara my mother");
            case "Ashok" -> System.out.println("this is my father");
            case "sarita" -> System.out.println("this is my sister");
            case "isha" -> System.out.println("this is my princes");
            case "tanushree" -> System.out.println("this  is yours heart");
            case "bapan" -> System.out.println("this is my jiju");
            default -> System.out.println("this is not ur family member");
        }


    }
}
