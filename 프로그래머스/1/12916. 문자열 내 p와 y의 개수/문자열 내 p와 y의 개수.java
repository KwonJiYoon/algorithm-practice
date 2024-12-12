class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        
        s = s.toLowerCase();
        
        for(int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i); 
            if(c == 'p') {
                pCount ++;
            } 
            if(c == 'y') {
                yCount ++;
            }
        }
        
        return pCount == yCount;
    }
}