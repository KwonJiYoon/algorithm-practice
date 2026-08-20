class Solution {
    public int solution(String str1, String str2) {
        int index = str1.indexOf(str2);
        
        
        return index > -1 ? 1 : 2;
    }
}