class Solution {
    public int[] solution(String s) {
        char[] arr = s.toCharArray();
        int[] answer = new int[arr.length];
       
        for(int i = 0; i < arr.length; i++) {
            if(i == 0) {
                answer[0] = -1;
                continue;
            }
            for(int j = i - 1; j >= 0; j--) {
                if(arr[i] == arr[j]) {
                    answer[i] = i - j;
                    System.out.println(i - j);
                    break;
                } else {
                    answer[i] = -1;
                }
            }
        }
        
        return answer;
    }
}