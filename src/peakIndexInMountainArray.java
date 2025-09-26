class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] < arr[mid + 1]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {0, 2, 4, 6, 5, 3, 1};
        int peakIndex = sol.peakIndexInMountainArray(arr);
        System.out.println("Peak Index: " + peakIndex);
        System.out.println("Peak Value: " + arr[peakIndex]);
    }
}
