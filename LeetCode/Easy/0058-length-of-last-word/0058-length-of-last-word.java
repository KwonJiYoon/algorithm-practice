class Solution {
    public int lengthOfLastWord(String s) {
        String[] word = s.split(" ");

        for(int i = word.length - 1; i >= 0; i --) {
            if(!word[i].isBlank()) {
                return word[i].length();
            }
        }

        return 0;
    }
}