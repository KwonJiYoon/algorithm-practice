class Solution {
    public int solution(int num) {
        int answer = 0;
        long target = (long)num;
        
        while(target != 1) {
            if(target % 2 == 0) {
                target = target / 2;
            } else {
                target = target * 3 + 1;
            }
            answer++;
            
            if(answer == 500) {
                return -1;
            }
        }
        return answer;
    }
}