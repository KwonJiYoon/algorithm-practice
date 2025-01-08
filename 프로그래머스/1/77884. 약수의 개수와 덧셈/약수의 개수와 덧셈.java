class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int num = left;
        
        while(num <= right) {
            answer += getDivisorOfNumCount(num) % 2 == 0 ? num : -num;
            num ++;
        }
        

        return answer;
    }
    
    public int getDivisorOfNumCount(int num) {
        int count = 0;
        
        for (int i = 1; i * i <= num; i++) {
                if (i * i == num) {
                    count++;
                } 
                else if (num % i == 0) {
                     count += 2;
                } 
        }
        
        return count;
    }
}