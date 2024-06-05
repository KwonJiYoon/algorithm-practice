class Solution {
    public List<String> commonChars(String[] words) {
        List<String> commonChars = new ArrayList<String>();
        int alphabetLength = 26;
        int[] minCharCounts = new int[alphabetLength];
        
        Arrays.fill(minCharCounts, Integer.MAX_VALUE);
        
        for (String word : words) {
            int[] charCounts = new int[alphabetLength];
            
            for (char character : word.toCharArray()) {
                charCounts[character - 'a']++;
            }
            
            for (int i = 0; i < alphabetLength; i++) {
                minCharCounts[i] = Math.min(minCharCounts[i], charCounts[i]);
            }
        }
        
        for (int i = 0; i < alphabetLength; i++) {
            while (minCharCounts[i] > 0) {
                commonChars.add((char) (i + 'a') + "");
                minCharCounts[i]--;
            }
        }
        
        return commonChars;
    }
}
