class Solution {
    public String solution(int[] food) {
        
        StringBuilder sb = new StringBuilder();
        int num = 1;
        
        for(int i = 0; i < food.length; i++) {
            if(i != 0) {
                sb.append(Integer.toString(num).repeat((food[i] % 2 == 0 ? food[i] : food[i] - 1) / 2));
                num++;
            }
        }

        return sb.toString() + 0 + sb.reverse().toString();
    }
}