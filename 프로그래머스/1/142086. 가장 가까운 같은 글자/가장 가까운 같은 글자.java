import java.util.*;

class Solution {
    public int[] solution(String s) {
        char[] arr = s.toCharArray();
        int[] answer = new int[arr.length];
        Map<Character, Integer> map = new HashMap<>();
       
        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                answer[i] = i - map.get(arr[i]);
            } else {
                answer[i] = -1;
            }
            map.put(arr[i], i);
        }
        
        return answer;
    }
}