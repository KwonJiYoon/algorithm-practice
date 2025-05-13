import java.util.*;

class Solution {
    Map<String, Integer> memo = new HashMap<>();

    public int solution(int[] numbers, int target) {
        return dfs(0, 0, numbers, target);
    }

    public int dfs(int depth, int sum, int[] numbers, int target) {
        String key = depth + "," + sum; // 현재 상태를 기억할 key

        if (memo.containsKey(key)) {
            return memo.get(key); // 이미 계산했던 값이면 다시 계산 안 하고 return
        }

        if (depth == numbers.length) {
            return sum == target ? 1 : 0; // 마지막까지 다 썼을 때 sum이 target이면 경우의 수 1
        }

        // 다음 숫자를 더하거나 빼는 두 가지 경우로 재귀 호출
        int plus = dfs(depth + 1, sum + numbers[depth], numbers, target);
        int minus = dfs(depth + 1, sum - numbers[depth], numbers, target);

        memo.put(key, plus + minus); // 현재 상태 결과 저장
        return plus + minus;
    }
}