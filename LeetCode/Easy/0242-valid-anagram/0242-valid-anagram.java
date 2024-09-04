class Solution {
    public boolean isAnagram(String s, String t) {

        Map<Character, Integer> map = new HashMap<>();

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            map.put(sChar, map.getOrDefault(sChar, 0) + 1);
        }

        for(int j = 0; j < t.length(); j++) {
            char tChar = t.charAt(j);
            if(!map.containsKey(tChar) || map.get(tChar) == 0) {
                return false;
            } else {
                map.put(tChar, map.get(tChar) - 1);
            }
            
        }
        
        return true;
    }
}