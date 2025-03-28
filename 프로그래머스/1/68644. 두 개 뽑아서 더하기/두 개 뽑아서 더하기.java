import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> numbersSet = new HashSet<>();
        
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                numbersSet.add(numbers[i] + numbers[j]);
            }
        }
        
        return numbersSet.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}