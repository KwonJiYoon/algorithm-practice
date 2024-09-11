class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }
        
        int max = 0;

        for (int s : nums) {
            if (!set.contains(s - 1)) {
                int length = 1;
                while (set.contains(s + 1)) {
                    length++;
                    s++;
                }

                max = Math.max(max, length);

            }


        }

        return max;

    }
}