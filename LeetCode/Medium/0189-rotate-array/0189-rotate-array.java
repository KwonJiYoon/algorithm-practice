class Solution {

    public static void reverse(int nums[], int start, int end) {

        while (start < end) {
            // 시작과 끝 값 교환
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
           
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        // k가 배열의 범위 내에 있는지 확인
        k %= nums.length;
        // 전체 배열 뒤집기
        reverse(nums, 0, nums.length - 1);
        // k까지의 요소만 뒤집기
        reverse(nums, 0, k - 1);
        // 남은 요소 뒤집기
        reverse(nums, k, nums.length - 1);
    }
}