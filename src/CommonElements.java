import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {
        int[] a = {3, 6, 1, 7, 9, 8, 2, 2};
        int[] b = {9, 7, 3, 4, 9};

        ArrayList<Integer> result = commonElementss(a, b);
        System.out.println("Common Elements: " + result);
    }

    public static ArrayList<Integer> commonElementss(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int n = a.length;
        int m = b.length;
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (a[i] == b[j]) {
                res.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
        return res;
    }
}
