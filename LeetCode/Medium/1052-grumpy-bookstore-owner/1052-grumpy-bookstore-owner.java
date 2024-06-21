class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int totalSatisfied = 0;
        int extraSatisfied = 0;
        int maxExtraSatisfied = 0;

        // 가게 주인이 화를 내지 않는 시간대의 초기 총 만족도 계산
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                totalSatisfied += customers[i];
            }
        }

        // 처음 'minutes' 동안의 추가 만족도 계산
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                extraSatisfied += customers[i];
            }
        }
        maxExtraSatisfied = extraSatisfied;

        // 슬라이딩 윈도우를 사용하여 최대 추가 만족도 찾기
        for (int i = minutes; i < customers.length; i++) {
            if (grumpy[i] == 1) {
                extraSatisfied += customers[i];
            }
            if (grumpy[i - minutes] == 1) {
                extraSatisfied -= customers[i - minutes];
            }
            maxExtraSatisfied = Math.max(maxExtraSatisfied, extraSatisfied);
        }

        // 결과는 총 만족도와 최대 추가 만족도의 합
        return totalSatisfied + maxExtraSatisfied;
    }
}
