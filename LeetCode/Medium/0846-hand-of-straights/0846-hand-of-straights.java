class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {

        Map<Integer, Integer> map = new TreeMap<>();
        
        if (hand.length % groupSize == 0) {
            for (int i = 0; i < hand.length; i++) {
                map.put(hand[i], map.getOrDefault(hand[i], 0) + 1);
            }

            System.out.println(map);
            while(map.size() > 0) {
        
            int current_card = map.entrySet().iterator().next().getKey();
            System.out.println(current_card);

            // current_card = 2
          
            for (int i = 0; i < groupSize; i++) {
                if(map.containsKey(current_card + i)) {     // 2 + 0 = 2 / 2 + 1 = 3 / 2 + 2 = 4
                    map.put(current_card + i, map.get(current_card + i) - 1);
                } else {
                    return false;
                }

                if (map.get(current_card + i) == 0) {
                    map.remove(current_card + i);
                } 

                
            }

        }

    } else {
        return false;
    }
    return true;
  }
  
}