import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void bubble(int[] arr) {
        int n = arr.length;
        for (int pass = 0;pass < n-2;pass++){
            boolean swaps = false;
        for (int i = 0; i < n-pass-1; i++) {
        if (arr[i] < arr[i + 1]) {
            swap(arr,i,i+1);
            swaps = true;
        }
    }
        if(!swaps) break;
}
    }
    public static void swap(int[] arr,int i , int j){
        while(i<j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }

    }
}
