class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        char[] charArr = my_string.toCharArray();
        
        for(char c : charArr) {
            for(int i = 0; i < n; i++){
                answer.append(c);
            }
        }
        return answer.toString();
    }
}