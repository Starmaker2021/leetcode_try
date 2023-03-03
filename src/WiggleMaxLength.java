public class WiggleMaxLength {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int curDiff = 0;
        int preDiff = 0;
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            curDiff = nums[i] - nums[i - 1];
            if ((curDiff > 0 && preDiff <= 0 || (curDiff < 0 && preDiff >= 0))) {
                count++;
                preDiff = curDiff;
            }
        }
        return count;
    }
}
