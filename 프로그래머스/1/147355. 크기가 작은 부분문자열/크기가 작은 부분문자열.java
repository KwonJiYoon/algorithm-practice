class Solution {
    public int solution(String t, String p) {
        int pLength = p.length();
        long pToNum = Long.parseLong(p);
        int result = 0;
        
        long tempNum = 0;
        
        // 첫 번째 부분 문자열 숫자로 변환
        for (int i = 0; i < pLength; i++) {
            tempNum = tempNum * 10 + (t.charAt(i) - '0');
        }

        // 첫 번째 숫자 비교
        if (tempNum <= pToNum) result++;

        // 슬라이딩 윈도우 기법 사용
        for (int i = pLength; i < t.length(); i++) {
            tempNum = (tempNum % (long) Math.pow(10, pLength - 1)) * 10 + (t.charAt(i) - '0');
            if (tempNum <= pToNum) result++;
        }
        
        return result;
    }
}