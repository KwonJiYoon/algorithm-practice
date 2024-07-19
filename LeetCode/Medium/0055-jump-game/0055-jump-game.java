class Solution {
    public boolean canJump(int[] nums) {

        int end = nums.length - 1;
        int jump = 0;

        for(int i = 0; i < nums.length; i++) {

            if (i > jump) {
                return false;
            }
            
            jump = Math.max(nums[i] + i, jump);
            
            
            
        }

        return jump >= end;

        
        
    }
}