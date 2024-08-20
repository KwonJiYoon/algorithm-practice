class Solution {
    public int lengthOfLastWord(String s) {
        String word = s.trim();
        int count = 0;

        for(int i = word.length() - 1; i >= 0; i --) {
            if(word.charAt(i) != ' ') {
                count++;
            }
            else if (count > 0) {
                return count;
            }
        }

        return count;
    }
}