class Solution {
    public int longestPalindrome(String s) {

        Map<Character, Integer> map = new HashMap<>();

        // Hashmap에서 중복 키 입력 시 값이 덮어쓰여지는 것 이용 
        // ( value 값의 default는 0이고, 같은 키 존재하는 경우에만 해당 키의 value 값 ) + 1
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int res = 0;
        boolean hasOddValue = false;

        for(int v : map.values()) {
            // value 값이 짝수라는 것은 같은 글자가 짝수개 존재 
            if((v % 2) == 0) {
                res += v;
            } else {
                // value 값이 홀수라는 것은 글자수가 홀수개 존재
                res += v - 1;
                hasOddValue = true;
            }
        }

        // 홀수로 존재하던 글자 중 한 글자는 가운데 삽입 시 문자열을 뒤집어도 영향을 미치지 않음
        // 따라서 홀수 글자 중 한 글자는 사용 가능
        if(hasOddValue) return res + 1;

        return res;

    }
}