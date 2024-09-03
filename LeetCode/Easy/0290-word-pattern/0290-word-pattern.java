class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] sArray = s.split(" ");
        Map<String, Character> map = new HashMap<>();

        if(sArray.length != pattern.length()) {
            return false;
        }


        for (int i = 0; i < sArray.length; i++) {

            String word = sArray[i];
            Character pChar = pattern.charAt(i);
            
            if(map.containsKey(word)) {
               if(map.get(word) != pChar) {
                return false;
               } 
            } else if (map.containsValue(pChar)) {
                return false;
            }

            map.put(word, pChar);
            
        }

        return true;
        
    }
}