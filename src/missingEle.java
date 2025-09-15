import java.util.*;
public class missingEle {
    public static void main(String[] args) {
        int[] arr = {3,2};
        Arrays.sort(arr);
        int a = missingNum(arr);
        System.out.println(a);
    }
    public static int missingNum(int[] arr) {
        int n = arr.length;
        for(int i =0;i<n;i++) {
        if(arr[i] != i+1) return i+1;
        }
        return n+1;
    }

}
