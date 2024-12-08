class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for(int i = 0; i < n; i++) {
            long num = 0;
            
            if(i == 0) {
                num = (long)x;
            } else {
                num = answer[i-1] + (long)x; 
            }
            answer[i] = num;
        }
        return answer;
    }
}

// (long) x :: 기본 타입만 필요할 때 사용 (성능과 메모리 효율성 때문).
// Long.valueOf(x) :: 객체(Long)가 필요할 때 사용 (컬렉션 등에 저장하거나 null 값을 처리해야 할 때).

