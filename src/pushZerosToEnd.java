import java.util.Arrays;

public class pushZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,4,2,3,0,6,0,7,0,9,8,0};
        int i =0, j = 0;
        zeroInTheEnd(arr,i,j);
        System.out.println(Arrays.toString(arr));
    }
    public static void zeroInTheEnd(int[] arr,int i , int j){
        for (int k = 0; k < arr.length; k++) {
            for (int l = 0; l < arr.length-k; l++) {
                if (arr[k] !=0){
                    int temp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = temp;
                    j++;
                }

            }

        }

    }
}
