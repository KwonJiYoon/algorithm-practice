class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long n = 1;
        long totalPrice = 0;
        
        while (n <= count) {
            totalPrice += price * n;
            n++;
        }

        answer = totalPrice > money ? totalPrice - money : 0;


        return answer;
    }
}