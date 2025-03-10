class Solution {
    public int solution(int n) {
        String str = "";

        // 10진법 → 3진법 변환 (뒤집힌 순서로 저장됨)
        while (n != 0) {
            str += n % 3;   // 3으로 나눈 나머지를 문자열에 추가
            n /= 3;         // n을 3으로 나눈 몫을 업데이트 (다음 자리 계산)
        }

        // 뒤집힌 3진법 숫자를 10진법으로 변환
        return Integer.parseInt(str, 3);
    }
}