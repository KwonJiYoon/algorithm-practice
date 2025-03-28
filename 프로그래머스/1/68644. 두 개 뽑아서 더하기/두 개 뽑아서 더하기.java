import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        // 자동 정렬이 되는 TreeSet
        TreeSet<Integer> numbersSet = new TreeSet<>();
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                numbersSet.add(numbers[i] + numbers[j]);
            }
        }
        
        int[] answer = new int[numbersSet.size()];
        
        // TreeSet은 for문의 index 사용 불가
        int idx = 0;
        for (int num : numbersSet) {
            answer[idx++] = num;
        }
        
        return answer;
    }
}