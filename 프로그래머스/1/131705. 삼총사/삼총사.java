class Solution {
    public int solution(int[] number) {
        int length = number.length;
        int sum = 0;
        int count = 0;
        
        for(int i = 0; i < length; i++) {
            sum = number[i];
            for(int j = i + 1; j < length; j++) {
                sum += number[j];
                for(int n = j + 1; n < length; n++) {
                    if(sum + number[n] == 0) {
                        count ++;
                    }
                }
                sum = number[i];
            }
            sum = 0;
        }
        return count;
    }
}