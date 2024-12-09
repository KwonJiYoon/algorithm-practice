class Solution {
    public int solution(int n) {
        int answer = 0;

        // i의 초기값이 1인 경우 불필요한 연산 발생 :: 어떤 수 n에 대해 n % 1은 항상 0
        for(int i = 2; i < n / 2; i++) {
            if(n % i == 1) {
                answer = i;
                break;
            }
        }
        
        return answer == 0 ? n - 1 : answer;
    }
}