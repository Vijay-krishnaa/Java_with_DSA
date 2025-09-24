import java.util.Arrays;

class  Solution1{
    public static void main(String[] args) {
    int[] arr = {3,1,2};
    inserTionSort(arr);
    System.out.println(Arrays.toString(arr));
    }
    private static void inserTionSort(int[] arr) {
        for (int i = 1; i <arr.length ; i++) {
            for (int j = i; j > 0; j--) {
                if(arr[j] > arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                }

            }

        }
    }
}