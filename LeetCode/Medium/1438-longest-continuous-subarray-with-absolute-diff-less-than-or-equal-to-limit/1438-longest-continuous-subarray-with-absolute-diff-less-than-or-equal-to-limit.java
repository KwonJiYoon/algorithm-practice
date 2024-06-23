import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public int longestSubarray(int[] nums, int limit) {
        // 슬라이딩 윈도우의 양 끝을 유지하는 덱
        Deque<Integer> maxDeque = new LinkedList<>();
        Deque<Integer> minDeque = new LinkedList<>();
        int left = 0;
        int maxLength = 0;

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

            // 윈도우 조건 확인 및 필요 시 축소
            while (nums[maxDeque.peekFirst()] - nums[minDeque.peekFirst()] > limit) {
                left++;
                if (maxDeque.peekFirst() < left) {
                    maxDeque.pollFirst();
                }
                if (minDeque.peekFirst() < left) {
                    minDeque.pollFirst();
                }
            }

            // 최대 길이 갱신
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
