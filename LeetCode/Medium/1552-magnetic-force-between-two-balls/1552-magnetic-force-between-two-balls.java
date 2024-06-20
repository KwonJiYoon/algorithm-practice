class Solution {

    // 주어진 위치 배열과 공의 개수를 이용하여 두 공 사이의 최소 거리를 최대화하는 값 찾기
    public int maxDistance(int[] position, int m) {

        // 배열 정렬
        Arrays.sort(position);

        // 가능한 최소 거리의 초기값 (= 최소거리는 1)
        int start = 1;
        
        // 가능한 최대 거리의 끝 값  
        // (위치 맨 끝 값 - 위치 맨 앞 값) / 공 사이 간격 (공 수 - 1)
        int end = (position[position.length - 1] - position[0]) / (m - 1);

        //
        while(start <= end) {
            int mid = (end + start) / 2;
            int req = dist(position, mid);

            if(req >= m) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }

    public int dist(int[] nums, int mid) {
        int count = 1;
        int last = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - last >= mid) {
                count++;
                last = nums[i];
            }
        }
        
        return count;
    }
}

