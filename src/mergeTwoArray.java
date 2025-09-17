import java.util.Arrays;
public class mergeTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,1,11,23};
        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }
    public static int[] merge(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int[] arr3 = new int[n+m];
        int k = 0;
        for (int j : arr1) {
            arr3[k++] = j;
        }
        for (int j : arr2) {
            arr3[k++] = j;

        }
        return arr3;

    }

}
