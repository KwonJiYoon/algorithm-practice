class Solution {
    public int scoreOfString(String s) {
        
        int score = 0;

        // Math.abs : "절대값"을 찾기 위한 함수
        // charAt() : String으로 저장된 문자열 중에서 원하는 인덱스의 문자만 선택하여 char타입으로 변환
        // char 타입 : 문자는 아스키코드의 규칙에 맞게 숫자로 치환이 되어 컴퓨터에 저장
        for(int i = 0; i < s.length() - 1; i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }

        return score;
    }
}