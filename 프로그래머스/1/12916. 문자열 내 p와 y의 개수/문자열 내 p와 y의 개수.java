class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        
        s = s.toLowerCase();
        
        for(int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i); 
            if(c == 'p') {
                count ++;
            } else if(c == 'y') {
                count --;
            }
        }
        
        return count == 0;
    }
}
