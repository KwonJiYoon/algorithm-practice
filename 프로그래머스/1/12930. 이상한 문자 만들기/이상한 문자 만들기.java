class Solution {
    
    public String solution(String s) {
        String answer = "";
        String[] stringArr = s.split("");
        int index = 0;
        
        for(int i = 0; i < stringArr.length; i++) {
            if(stringArr[i].equals(" ")) {
                index = 1;
            } 
            
            answer += index % 2 == 0 ? stringArr[i].toUpperCase() : stringArr[i].toLowerCase();
            index ++;
        }
        
        
        
        return answer;
    }
}