import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder st = new StringBuilder();
        String[] nums = s.split(" "); 
        int min = Integer.parseInt(nums[0]);
        int max = Integer.parseInt(nums[0]);
        
        for(int i = 1; i < nums.length; i++) {
            int target = Integer.parseInt(nums[i]);
                        
            min = Math.min(min, target);
            max = Math.max(max, target);
            
        }
        
        st.append(String.valueOf(min));
        st.append(" ");
        st.append(String.valueOf(max));
        
        return st.toString();
    }
}