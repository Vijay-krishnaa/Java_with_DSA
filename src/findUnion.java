import java.util.*;

class FindUnion {
    public static ArrayList<Integer> findUnions(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>();

        while (i < n && j < m) {
            while (i + 1 < n && a[i] == a[i + 1]) i++;
            while (j + 1 < m && b[j] == b[j + 1]) j++;

            if (a[i] < b[j])
                ans.add(a[i++]);
            else if (b[j] < a[i])
                ans.add(b[j++]);
            else {
                ans.add(b[j++]);
                i++;
            }
        }
        while (i < n) {
            while (i + 1 < n && a[i] == a[i + 1]) i++;
            ans.add(a[i++]);
        }

        while (j < m) {
            while (j + 1 < m && b[j] == b[j + 1]) j++;
            ans.add(b[j++]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 5};
        int[] b = {2, 3, 4, 5, 6,7};

        System.out.println(findUnions(a, b));
    }
}
