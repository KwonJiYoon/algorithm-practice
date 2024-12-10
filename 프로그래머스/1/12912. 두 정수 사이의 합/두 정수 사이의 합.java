class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int big = b;
        int small = a;
        
        if (a > b) {
            big = a;
            small = b;
        } 
        
        while (small <= big) {

            if (small == big) {
                answer += small;
            } else {
                answer += small + big;
            }
            
            small ++;
            big --;
        }
        return answer;
    }
}