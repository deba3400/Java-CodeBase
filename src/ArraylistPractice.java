import java.util.ArrayList;

public class ArraylistPractice {





    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (String i : cars) {
            System.out.println(i);
        }
        ArrayList<Integer> l1=new ArrayList<>(10);
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        System.out.println(l1);
        System.out.println(l1.get(2));
        l1.remove(2);



        for(int i=0; i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        ArrayList<Integer> l2=new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        System.out.println(l2);
        l1.addAll(l2);
        System.out.println(l1);
    }
}
