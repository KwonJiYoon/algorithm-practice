class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        // 현재까지의 홀수 개수 저장
        int oddSum = 0;
        
        // 조건에 맞는 부분배열 수 저장
        int subArr = 0;

        // 특정 누적 합 발생 횟수 저장
        // 초기값 :: oddSum이 0인 경우 1번 발생
        Map<Integer, Integer> map = new HashMap<>();
        map.put(oddSum, 1);

        for(int i = 0; i < nums.length; i++) {
            // 현재 수 홀수/짝수 구분
            oddSum += nums[i] % 2;
            // map에 oddSum - k를 한 값이 존재하면 현재 구간에 홀수가 k개 존재
            if(map.containsKey(oddSum - k)) {
                subArr += map.get(oddSum - k);
            }

            map.put(oddSum, map.getOrDefault(oddSum, 0) + 1);
        }

        return subArr;
    }
}