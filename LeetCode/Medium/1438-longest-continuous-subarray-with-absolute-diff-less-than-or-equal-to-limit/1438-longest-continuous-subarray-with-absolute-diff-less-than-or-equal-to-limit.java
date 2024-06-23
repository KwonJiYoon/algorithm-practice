import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public int longestSubarray(int[] nums, int limit) {
        // 최대값과 최소값을 저장하는 덱
        Deque<Integer> maxDeque = new LinkedList<>();
        Deque<Integer> minDeque = new LinkedList<>();
        int left = 0; // 슬라이딩 윈도우의 왼쪽 끝
        int maxLength = 0; // 조건을 만족하는 가장 긴 부분 배열의 길이

        for (int right = 0; right < nums.length; right++) {
            // maxDeque 업데이트: 현재 값보다 작은 값 제거
            while (!maxDeque.isEmpty() && nums[maxDeque.peekLast()] <= nums[right]) {
                maxDeque.pollLast();
            }
            maxDeque.addLast(right);

            // minDeque 업데이트: 현재 값보다 큰 값 제거
            while (!minDeque.isEmpty() && nums[minDeque.peekLast()] >= nums[right]) {
                minDeque.pollLast();
            }
            minDeque.addLast(right);

            // 윈도우 내의 최대값과 최소값의 차이가 limit을 초과하면 윈도우 축소
            while (nums[maxDeque.peekFirst()] - nums[minDeque.peekFirst()] > limit) {
                left++; // 윈도우의 왼쪽 끝을 오른쪽으로 이동
                if (maxDeque.peekFirst() < left) {
                    maxDeque.pollFirst();
                }
                if (minDeque.peekFirst() < left) {
                    minDeque.pollFirst();
                }
            }

            // 조건을 만족하는 현재 윈도우의 길이를 계산하여 최대 길이 갱신
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {8, 2, 4, 7};
        int limit = 4;
        int result = solution.longestSubarray(nums, limit);
        System.out.println("Result: " + result);  // Output: 2
    }
}
