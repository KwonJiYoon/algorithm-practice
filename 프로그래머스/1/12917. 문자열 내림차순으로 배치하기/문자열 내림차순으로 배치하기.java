import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] charArr = s.toCharArray();
        
        Arrays.sort(charArr);
        
        return new StringBuilder(new String(charArr)).reverse().toString();
    }
}