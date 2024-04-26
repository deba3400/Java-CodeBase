public class AddObject {
    public static void main(String[] args) {
        demo A=new demo(2,3);
        demo B=new demo(4,5);

        demo C=new demo((A.X+B.X),(A.Y+B.Y));
        System.out.println(C.X);
        System.out.println(C.Y);

    }
}
class demo{

    int X;
    int Y;
    public demo(int X, int Y){
        this.X=X;
        this.Y=Y;
    }
}
