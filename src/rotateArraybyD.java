import java.util.Arrays;
public class rotateArraybyD {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        int d = 2;
        rotateArr(arr,d);
        System.out.println(Arrays.toString(arr));
    }
        public static void  rotateArr(int[] arr, int d) {
            int n = arr.length;
            d %=n;
            reverse(arr,0,d-1);
            reverse(arr,d,n-1);
            reverse(arr,0,n-1);
        }
        public static void reverse(int[] nums , int i, int j ){
            while(i<j){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j] = temp;
                i++;
                j--;

        }
    }
    }

