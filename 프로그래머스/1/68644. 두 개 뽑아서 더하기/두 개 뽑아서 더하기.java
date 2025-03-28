import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> numbersSet = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                numbersSet.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[numbersSet.size()];
        int idx = 0;
        for (int num : numbersSet) {
            answer[idx++] = num;
        }

        Arrays.sort(answer); 

        return answer;
    }
}
