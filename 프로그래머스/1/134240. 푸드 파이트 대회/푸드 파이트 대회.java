class Solution {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        int num = 1;

        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            for (int j = 0; j < count; j++) {
                left.append(num);
                right.insert(0, num);
            }
            
            num++;
        }

        return left.toString() + "0" + right.toString();
    }
}