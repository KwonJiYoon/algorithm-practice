class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(n % 3);  // 3으로 나눈 나머지를 추가
            n /= 3;
        }

        return Integer.parseInt(sb.toString(), 3); // 3진법 문자열 → 10진법 변환
    }
}