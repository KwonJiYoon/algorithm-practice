import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder st = new StringBuilder();
        String[] nums = s.split(" "); 
        int min = 0;
        int max = 0;
        
        for(int i = 0; i < nums.length; i++) {
            int target = Integer.parseInt(nums[i]);
            
            if(i == 0) {
                min = target;
                max = target;
            } else {
                min = Math.min(min, target);
                max = Math.max(max, target);
            }            
            
        }
        
        st.append(String.valueOf(min));
        st.append(" ");
        st.append(String.valueOf(max));
        
        return st.toString();
    }
}