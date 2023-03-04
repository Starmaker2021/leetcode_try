public class CanJump {
    public boolean canJump(int[] nums) {
        if(nums.length == 1){
            return true;
        }
        int coverRange = 0;
        for (int i = 0; i <=coverRange; i++) {
            coverRange = Math.max(i+nums[i],coverRange);
            if(coverRange>= nums.length-1){
                return true;
            }
        }
        return false;
    }
}
