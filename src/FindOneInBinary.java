public class FindOneInBinary {
    public static void main(String[] args) {
        int a[]={5,3,2,6};
        int base=2;
        for(int i=0;i<a.length;i++) {
            int BInary= Integer.parseInt(Integer.toString(a[i], base));
            System.out.println(BInary);
        }
    }
}
