class Solution {
    boolean visit[];
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visit = new boolean[n];
        
        for(int i = 0; i < n; i++) {
            if(visit[i] == false) {
                answer++;
                dfs(n, i, computers);
            }
        }
        return answer;
    }
    
    public void dfs(int n, int i, int[][] computers) {
        
        visit[i] = true;
        
        for(int j = 0; j < n; j++) {
            if(visit[j] == false && computers[i][j] == 1) {
                dfs(n, j, computers);
            }
        }
    }
}