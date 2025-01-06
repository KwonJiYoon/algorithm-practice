class Solution {
    public String solution(String s) {
        String answer = "";
        
        int length = s.length();
        
        int startIndex = (length - 1) / 2;
        int endIndex = length / 2 + 1;
        
        answer = s.substring(startIndex, endIndex);
        
        return answer;
    }
}