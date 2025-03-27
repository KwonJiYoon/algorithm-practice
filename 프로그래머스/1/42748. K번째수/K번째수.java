import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        
        for(int[] arr : commands) {
            int [] targets = Arrays.copyOfRange(array, arr[0] - 1, arr[1]);
            Arrays.sort(targets);
            
            answer[idx] = targets[arr[2] - 1];
            idx++;
        }
        
        return answer;
    }
}