import java.util.Arrays;

class Solution {
    int count = 0;
    
    public int solution(int[] number) {
        boolean[] visit = new boolean[number.length];
        Arrays.sort(number);
        
        backTracking(number, visit, 0, 0, 0);
        
        return count;
    }
    
    private void backTracking(int[] number, boolean[] visit, int start, int depth, int sum) {
        if(depth == 3) {
            if(sum == 0) {
                count++;
            }
            return;
        }
        
        for(int i = start; i < number.length; i++) {
            if(visit[i]) {
                continue;
            }
            
            visit[i] = true;
            backTracking(number, visit, i + 1, depth + 1, sum + number[i]);
            visit[i] = false;
        }
        
    }
}