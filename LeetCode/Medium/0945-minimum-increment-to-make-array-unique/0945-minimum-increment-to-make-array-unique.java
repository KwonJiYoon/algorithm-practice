class Solution {

    public int minIncrementForUnique(int[] nums) {
        int count = 0;

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            // 이전 값이 크거나 같은 경우
            if (nums[i] <= nums[i - 1]) {
                
                int increment = nums[i - 1] + 1 - nums[i];
                count += increment;

                nums[i] = nums[i - 1] + 1;
            }
        }

        return count;
    }
}