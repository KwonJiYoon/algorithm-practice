class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int sum = 0;

        // map 초기화
        map.put(0, 1);

        for (int num : nums) {
            sum += num;
            int remain = sum % k;

            if (remain < 0) {
                remain += k;
            }

            if(map.containsKey(remain)) {
                count += map.get(remain);
                map.put(remain, map.get(remain) + 1);
            } else {
                map.put(remain, 1);
            }
        }
        return count;
    }
}