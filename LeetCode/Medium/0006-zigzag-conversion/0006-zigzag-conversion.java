class Solution {
    public String convert(String s, int numRows) {

        String[] array = new String[numRows];
        Arrays.fill(array, "");

        int index = 0;
        int direction = 1;

        for(int i = 0; i < s.length(); i++){
            
            array[index] += s.charAt(i);

            if(index == 0) {
                direction = 1;
            } else if (index == numRows - 1) {
                direction = -1;
            }

            if(numRows != 1) {
                index += direction;
            }
        }
        
        return String.join("", array);
        
    }
}