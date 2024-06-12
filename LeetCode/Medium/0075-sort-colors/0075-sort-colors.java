class Solution {
    public void sortColors(int[] nums) {
        
        int length = nums.length - 1;
        
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length - i; j++) {
                int temp = 0;
                if(nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}