import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
//        int i = 0;
//        int j = arr.size() - 1;
//        while (i < j) {
//            int temp = arr.get(i);
//            arr.set(i, arr.get(j));
//            arr.set(j, temp);
//            i++;
//            j--;
//        }
        Collections.reverse(arr);
        System.out.println(arr);
    }
}
