import java.util.ArrayList;

public class ArrrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(arr.get(2));
        System.out.println(arr.set(2,7));
        System.out.println(arr);
        for (Integer integer : arr) {
            System.out.print(integer);

        }

    }
}
