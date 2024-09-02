class Solution {
    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            Character sChar = s.charAt(i);
            Character tChar = t.charAt(i);
            
            if(map.containsKey(sChar)) {
               if(map.get(sChar) != tChar) {
                return false;
               } 
            } else if (map.containsValue(tChar)) {
                return false;
            }

            map.put(s.charAt(i), t.charAt(i));
            
        }

        return true;
        
    }
}