class Solution {
    public boolean isPalindrome(String s) {
    
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        

        int start = 0;
        int end = s.length() - 1;
        
        if (s.length() == 0) {
            return true;
        }

        while(start < end) {
            if(s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
            
        }
        

        return true;
    }
}