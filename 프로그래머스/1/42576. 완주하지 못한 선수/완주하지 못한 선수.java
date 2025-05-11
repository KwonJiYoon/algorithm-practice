import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> compInfo = new HashMap<>();
        
        for(String p : participant) {
            compInfo.put(p, compInfo.getOrDefault(p, 0) + 1);
        }
        
        for(String p : completion) {
            compInfo.put(p, compInfo.get(p) - 1);
        }
        
        for (String key : compInfo.keySet()) {
            if (compInfo.get(key) != 0){
                answer = key;
            }
        }
        return answer;

    }
}