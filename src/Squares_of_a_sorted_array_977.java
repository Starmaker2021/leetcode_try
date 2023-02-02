public class Squares_of_a_sorted_array_977 {
    /**
     * @author:TanShi
     * @date:2023/2/2
     * @description:Leetcode算法题 977
     * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
     * <p>
     * 示例 1：
     * 输入：nums = [-4,-1,0,3,10]
     * 输出：[0,1,9,16,100]
     * 解释：平方后，数组变为 [16,1,0,9,100]
     * 排序后，数组变为 [0,1,9,16,100]
     */

    public static void main(String[] args) {
        int[] nums = {-40};
        sortedSquares(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(sortedSquares(nums)[i]);
        }
    }

    //双指针法：由于绝对值大的值在两端，所以两个指针指向两端，比较之后往中间移动
    public static int[] sortedSquares(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        int left = 0;
        int right = length - 1;
        int index = 0;
        while (left <= right) {
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                result[length - index - 1] = nums[right] * nums[right];
                right--;
            } else {
                result[length - index - 1] = nums[left] * nums[left];
                left++;
            }
            index++;
        }
        return result;
    }
}
