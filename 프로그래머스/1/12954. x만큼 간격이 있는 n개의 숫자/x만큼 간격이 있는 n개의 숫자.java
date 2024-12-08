class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for(int i = 0; i < n; i++) {
            long num = 0;
            
            if(i == 0) {
                num = (long)x;
            } else {
                num = answer[i-1] + (long)x; 
            }
            
            answer[i] = num;
            
        }
        return answer;
    }
}