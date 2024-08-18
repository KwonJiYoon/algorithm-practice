class Solution {
    public int[] productExceptSelf(int[] nums) {

        int length = nums.length;
        int result[] = new int[length];
        int multiply = 1;

        for(int i = 0; i < length; i++) {
            result[i] = multiply;
            multiply *= nums[i];
        }

        multiply = 1;

        for(int j = length - 1; j >= 0; j--) {
            result[j] *= multiply;
            multiply *= nums[j];
        }

    
        return result;
        
    }
}