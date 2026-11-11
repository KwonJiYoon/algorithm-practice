import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        int[] scores = {0, 0, 0};
        
        // 정답 맞춘 사람 점수 +
        for (int i = 0; i < answers.length; i++) {
            int num = answers[i];
            if(num == first[i % first.length]) scores[0]++;
            if(num == second[i % second.length]) scores[1]++;
            if(num == third[i % third.length]) scores[2]++;
        }
        
        // 가장 높은 점수
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));

        // 가장 높은 점수인 사람 
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < scores.length; i++) {
            if (maxScore == scores[i]) {
                answer.add(i + 1);
            }
        }
        
        // list -> Array
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}