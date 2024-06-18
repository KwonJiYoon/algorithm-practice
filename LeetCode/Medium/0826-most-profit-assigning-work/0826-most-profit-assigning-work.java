class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;

        // index와 difficulty, profit으로 구성된 이중 배열
        int[][] jobs = new int[n][2];
        for (int i = 0; i < n; i++) {
            jobs[i][0] = difficulty[i];
            jobs[i][1] = profit[i];
        }

        // 배열 정렬 
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);   // difficulty기준 
        Arrays.sort(worker);


        int maxProfit = 0, i = 0, best = 0;
        
        for (int ability : worker) {
            while (i < n && ability >= jobs[i][0]) {
                // 수행할 수 있는 작업 중 가장 큰 이익을 얻을 수 있는 작업 선택
                best = Math.max(best, jobs[i][1]);
                i++;
            }
            maxProfit += best;
        }

        return maxProfit;
    }
}