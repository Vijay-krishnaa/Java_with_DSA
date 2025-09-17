public class Sort0s1sand2s {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 2, 1, 2, 1, 1, 2};
        SortZero_ones_twos(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void SortZero_ones_twos(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
       while (mid<=high){
      if(arr[mid] == 1) mid++;
      else if (arr[mid] == 0){
          int temp  = arr[low];
          arr[low] = arr[mid];
          arr[mid]  = temp;
          low++;
          mid++;
      }
      else {
          int temp  = arr[mid];
          arr[mid] = arr[high];
          arr[high]  = temp;
          high--;

      }
  }
    }
}