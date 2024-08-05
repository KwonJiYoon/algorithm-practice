class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int move = 0;
        int index = 0;
        int total = 0;

        for(int i = 0; i < gas.length; i++) {
            move += gas[i] - cost[i];
            total += gas[i] - cost[i];

            if(total < 0) {
                total = 0;
                index = i + 1;
            }

        }
        
        return move < 0 ? -1 : index;
    }
}