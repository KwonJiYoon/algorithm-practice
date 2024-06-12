class Solution {
    public int appendCharacters(String s, String t) {
        
        int index = 0;
        int prefix = 0;

        while(index < s.length() && prefix < t.length()) {
            if(s.charAt(index) == t.charAt(prefix)) {
                prefix ++;
            }
            index ++;
        }

        return t.length() - prefix;

    }
}