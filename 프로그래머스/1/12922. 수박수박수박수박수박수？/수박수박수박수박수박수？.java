class Solution {
    public String solution(int n) {
        
//         StringBuilder answer = new StringBuilder();
        
//         for(int i = 1; i <= n; i++) {
//             answer.append(i % 2 != 0 ? "수" : "박");
//         }
        
//         return answer.toString();
        
        
        String word = "수박".repeat(n / 2 + 1);
        return word.substring(0, n);
        
    }
}