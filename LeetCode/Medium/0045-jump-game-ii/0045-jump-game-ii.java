class Solution {
    public int jump(int[] nums) {
        int end = 0;
        int jump = 0;
        int count = 0;

        for(int i = 0; i < nums.length - 1; i++) {

            jump = Math.max(nums[i] + i, jump);

            if(i == end) {
                end = jump;
                count++;
            }
        
        }

        return count;
    }
}