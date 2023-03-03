public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int sum = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
            if (count <= 0) {
                count = 0;
            }
        }
        return sum;
    }
}
