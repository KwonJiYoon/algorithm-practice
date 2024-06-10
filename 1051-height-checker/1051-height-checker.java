class Solution {
    public int heightChecker(int[] heights) {
        
        // heights 배열 오름차순 정렬
        int[] expected = Arrays.stream(heights).sorted().toArray();
        int count = 0;

        for(int i = 0; i < heights.length; i ++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        
        return count;
    }
}