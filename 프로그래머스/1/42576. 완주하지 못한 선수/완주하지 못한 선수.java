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
        
        Iterator<Map.Entry<String, Integer>> iter = compInfo.entrySet().iterator(); 
        
        while(iter.hasNext()) {
            Map.Entry<String, Integer> entry = iter.next(); 
            if (entry.getValue() != 0){ 
                answer = entry.getKey();
                break; 
            } 
        }
        
        return answer;
    }
}