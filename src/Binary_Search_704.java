public class Binary_Search_704 {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 8, 9, 11};
        System.out.println(search(nums, 7));
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int num = nums[mid];
            if (num == target) {
                return mid;
            } else if (target < num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
