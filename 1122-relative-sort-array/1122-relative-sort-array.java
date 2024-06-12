class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < arr2.length; i++) {
             for(int j = 0; j < arr1.length; j++) {
                 if (arr2[i] == arr1[j]) {
                     result.add(arr1[j]);
                     // result에 add했다는 표시
                     arr1[j] = -1;
                 }
             }
        }
        
        // arr1 정렬
        Arrays.sort(arr1);
        
        // 정렬된 arr1에서 result 리스트에 추가되지 않은 요소들 추가
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] != -1) {
                result.add(arr1[i]);
            }
        }
        
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}