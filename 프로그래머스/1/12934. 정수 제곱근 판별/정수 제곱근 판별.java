class Solution {
    public long solution(long n) {
        long answer = -1;
        double root = Math.sqrt(n);

        if(root % 1 == 0) {
            answer = (long) Math.pow(root + 1, 2);
        }

        return answer;
    }
}