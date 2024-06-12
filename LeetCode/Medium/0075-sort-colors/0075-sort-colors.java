class Solution {
    public void sortColors(int[] nums) {

        int r = 0;
        int w = 0;
        int b = nums.length - 1;

        // nums = [2,0,2,1,1,0]
        // b = 5
        // w <= 5
        while (w <= b) {
            if (nums[w] == 0) {
                swap(r++, w++, nums);
            } else if (nums[w] == 1) {
                w++;
            } else {
                swap(w, b--, nums);
            }
        }
    }

    public void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

        System.out.println(Arrays.toString(nums));
    }

    // w : 0  / b : 5
    // num[0] : 2 > else > swap(0, 5, nums) 
    // i : 0, j : 5
    // temp = nums[0] = 2 // nums[0] = nums[5] = 0 // nums[5] = 2
    // [0, 0, 2, 1, 1, 2]

    // w : 0  / b : 4
    // num[0] : 0 > if > swap(0, 0, nums) 
    // i : 0, j : 0
    // temp = nums[0] = 0 // nums[0] = nums[0] = 0 // nums[0] = 0
    // [0, 0, 2, 1, 1, 2]

}