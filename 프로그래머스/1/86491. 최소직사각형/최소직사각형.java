import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;
        
        for(int[] size : sizes) {
            
            int max = Math.max(size[0], size[1]);
            int min = Math.min(size[0], size[1]);
            
            width = Math.max(width, max);
            height = Math.max(height, min);
            
        }
        
        return width * height;
    }
}