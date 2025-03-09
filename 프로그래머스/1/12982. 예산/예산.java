import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int remain = budget;
        int answer = 0;
        
        Arrays.sort(d);
        
        for (int needs : d) {
            remain -= needs;   
            
            if(remain < 0) {
               break;
            }
            
            answer++;
        }
        
        return answer;
    }
}