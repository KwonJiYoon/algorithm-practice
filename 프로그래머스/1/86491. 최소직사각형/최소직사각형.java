import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;
        
        for(int i = 0; i < sizes.length; i++) {
            
            int max = Math.max(sizes[i][0], sizes[i][1]);
            int min = Math.min(sizes[i][0], sizes[i][1]);
            
            width = Math.max(width, max);
            height = Math.max(height, min);
            
        }
        
        
        
        
        return width * height;
    }
}