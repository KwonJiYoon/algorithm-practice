class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

    Map<Character, Integer> map = new HashMap<>();

    for(int i = 0; i < magazine.length(); i++) {
        map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
    }

    System.out.print(map);
    for(int j = 0; j < ransomNote.length(); j++) {
        map.put(ransomNote.charAt(j), map.getOrDefault(ransomNote.charAt(j), 0) - 1);

        if(map.get(ransomNote.charAt(j)) < 0) {
            return false;
        }
    }
 
    return true;

        
    }
}