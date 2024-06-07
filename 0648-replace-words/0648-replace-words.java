class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {

        String s[] = sentence.split(" ");

        for(int i = 0; i < s.length; i++) {

            for(String dict : dictionary) {
                if (s[i].startsWith(dict)) {
                    s[i] = dict;
                }
            }
        }

        return String.join(" ", s);
    }
}