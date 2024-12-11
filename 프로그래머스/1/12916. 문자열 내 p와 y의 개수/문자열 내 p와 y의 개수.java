class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        
        for(int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i); 
            if(c == 'p') {
                pCount ++;
            } 
            if(c == 'y') {
                yCount ++;
            }
        }
        
        answer = checkCount(pCount, yCount);

        return answer;
    }
    
    public boolean checkCount(int pCount, int yCount) {
        if (pCount == 0 && yCount == 0) {
            return true;
        }
        if (pCount == yCount) {
            return true;
        }
        
        return false;
    }
}