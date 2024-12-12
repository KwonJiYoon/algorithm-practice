class Solution {
    public int[] solution(long n) {
        int digitCount = (int) Math.floor(Math.log10(n)) + 1;
        
        int[] answer = new int[digitCount];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }
        
        return answer;
    }
}