import java.util.*;
public class maximumCount {
    public static int maximumCountt(int[] nums) {
        int n = nums.length;
        int firstPos = firstPositive(nums);
        int lastNeg = lastNegative(nums);
        int countPos = (firstPos == -1) ? 0 : (n - firstPos);
        int countNeg = (lastNeg == -1) ? 0 : (lastNeg + 1);
        return Math.max(countPos, countNeg);
    }
    private static int firstPositive(int[] nums) {
        int s = 0, e = nums.length - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] > 0) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
    private static int lastNegative(int[] nums) {
        int s = 0, e = nums.length - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] < 0) {
                ans = mid;
                s = mid + 1; 
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums1 = {-3, -2, -1, 0, 0, 1, 2};
        System.out.println(maximumCountt(nums1));

    }
}
