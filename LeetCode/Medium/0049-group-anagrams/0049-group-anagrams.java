class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] sortArray = strs[i].toCharArray();

            Arrays.sort(sortArray);

            String sortStr = new String(sortArray);

            if(map.containsKey(sortStr)) {
                map.get(sortStr).add(strs[i]);
            } else {
                map.put(sortStr, new ArrayList<>(Arrays.asList(strs[i])));
            }

        }

        return new ArrayList<>(map.values());
    }
}