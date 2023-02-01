public class Remove_Element_27 {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println(removeElement(nums, 3));
        System.out.println(removeElement2(nums, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int left = 0;
        int right = 0;
        while (right < nums.length - 1) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
            right++;
        }
        return left;
    }

    public static int removeElement2(int[] nums, int val) {
        int left = 0;
        int right = nums.length;
        while (left<right) {
           if(nums[left]==val){
               nums[left]=nums[right-1];
               right--;
           }
           else{
               left++;
           }
        }
        return left;
    }
}
