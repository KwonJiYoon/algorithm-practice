class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length();
        
        StringBuilder stringBuilder = new StringBuilder();
        
        for(int i = 0; i < length; i++) {
            if( i < length - 4) {
                stringBuilder.append("*");
            } else {
                stringBuilder.append(phone_number.charAt(i));
            }
        }
        
        answer = stringBuilder.toString();
        return answer;
    }
}