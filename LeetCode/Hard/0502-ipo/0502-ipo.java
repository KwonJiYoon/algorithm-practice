class Solution {

    private static class Project {
        int capital;
        int profit;

        Project(int capital, int profit) {
            this.capital = capital;
            this.profit = profit;
        }
    }


    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        List<Project> projects = new ArrayList<>();

        // profits와 capital로 구성된 Project List 생성
        for(int i = 0; i < n; i++) {
            projects.add(new Project(capital[i], profits[i]));
        }
        
        // k = 2, w = 0, profits = [1,2,3], capital = [0,1,1]
        
        // project 리스트 정렬 :: capital 오름차순
        Collections.sort(projects, (a, b) -> a.capital - b.capital);

        // profits 최대 힙 저장
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((x, y) -> y - x);
        int i = 0;

        // 최대 k개의 프로젝트를 선택하기 위한 루프
        for (int j = 0; j < k; j++) {
            // 0, 1 반복
            // w로 자금을 지원할 수 있는 모든 프로젝트를 최대 힙에 추가
            while (i < n && projects.get(i).capital <= w) {
                // i = 0  > maxHeap.add(1);
                // i = 1 > maxHeap.add(2);
                // i = 2 > maxHeap.add(3);
                maxHeap.add(projects.get(i).profit);    
                // System.out.println(maxHeap);
                // System.out.println(j);
                i++;
            }

            // maxHeap이 비어있는 경우 :: 자금을 지원할 수 있는 프로젝트가 없음
            if (maxHeap.isEmpty()) {
                break;
            }

            // maxHeap에서 가장 높은 수익을 가지는 프로젝트를 선택하여 현재 자본에 해당 수익 더하기
            w += maxHeap.poll();
        }

        return w;
    }
}