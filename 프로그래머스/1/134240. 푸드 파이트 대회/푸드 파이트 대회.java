class Solution {
    public String solution(int[] food) {
        
        StringBuilder sb = new StringBuilder();
        int num = 1;
        
        for(int i=1; i<food.length; i++){
            for(int j=0; j<food[i]/2; j++){
                sb.append(i);
            }
        }

        return sb.toString() + 0 + sb.reverse().toString();
    }
}