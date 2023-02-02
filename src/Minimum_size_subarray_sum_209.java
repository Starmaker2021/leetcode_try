public class Minimum_size_subarray_sum_209 {
    /**
     * @author:TanShi
     * @date:2023/2/2
     * @description:给定一个含有 n 个正整数的数组和一个正整数 target 。
     * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组[numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。
     * 如果不存在符合条件的子数组，返回 0 。
     * 示例 1：
     * 输入：target = 7, nums = [2,3,1,2,4,3]
     * 输出：2
     */
    public static void main(String[] args) {
        int nums[] = {5, 6, 3, 4, 8};
        System.out.println(minSubArrayLen2(12, nums));
    }

    //暴力解法：利用两次for循环
    public static int minSubArrayLen1(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum >= target) {
                    temp = j - i + 1;
                    result = result < temp ? result : temp;
                    break;
                }
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

    //滑动窗口
    public static int minSubArrayLen2(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                result = result < (right - left + 1) ? result : (right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
