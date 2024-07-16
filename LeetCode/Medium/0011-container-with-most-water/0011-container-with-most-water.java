class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        
        while(left < right) {

            int c = Math.min(height[left], height[right]) * (right - left);

            if (c > max) {
                max = c;
            }

            if (height[left] < height[right]) {
                left ++;
            } else {
                right --;
            }


            
        }


        return max;
    }
}