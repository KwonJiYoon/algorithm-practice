class Solution {
    public int solution(String t, String p) {
        int length = t.length() - p.length() + 1;
        int result = 0;

        for (int i = 0; i < length; i++) {

            String tempNum = t.substring(i, i + p.length());

            if (Long.parseLong(tempNum) <= Long.parseLong(p)) {
                result ++;
            }


        }
        
        return result;
    }
}