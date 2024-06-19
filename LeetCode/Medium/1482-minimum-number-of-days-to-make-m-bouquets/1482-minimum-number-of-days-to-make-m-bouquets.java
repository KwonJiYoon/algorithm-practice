class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int start = 0; // 탐색 시작 값
        int end = 0;   // 탐색 종료 값 (bloomDay 배열의 최대값)
        
        // bloomDay 배열에서 최대값을 찾음
        for (int day : bloomDay) {
            end = Math.max(end, day);
        }

        int minDays = -1; // 결과를 저장할 변수 (-1은 부케를 만들 수 없는 경우)
        // 이진 탐색을 수행
        while (start <= end) {
            int mid = (start + end) / 2;

            // 주어진 일수 내에 m개의 부케를 만들 수 있는지 확인
            if (getNumOfBouquets(bloomDay, mid, k) >= m) {
                minDays = mid; // m개의 부케를 만들 수 있으면 일수를 저장
                end = mid - 1; // 더 적은 일수로도 가능한지 확인하기 위해 end를 줄임
            } else {
                start = mid + 1; // m개의 부케를 만들 수 없으면 start를 늘려서 더 많은 일수를 확인
            }
        }

        return minDays; // 최소 일수를 반환


    }

    private int getNumOfBouquets(int[] bloomDay, int mid, int k) {
        int numOfBouquets = 0;  // 만든 부케의 수를 저장
        int count = 0;          // 현재 연속된 꽃의 수를 저장

        for (int i = 0; i < bloomDay.length; i++) {
            // 꽃이 핀 경우, 연속된 꽃의 수를 증가
            if (bloomDay[i] <= mid) {
                count++;
            } else {
                count = 0; // 꽃이 피지 않았으면 연속된 꽃의 수를 초기화
            }

            // 연속된 꽃의 수가 k에 도달하면 부케를 만들고, 연속된 꽃의 수를 초기화
            if (count == k) {
                numOfBouquets++;
                count = 0;
            }
        }

        return numOfBouquets; // 만들어진 부케의 수를 반환
    }

}   