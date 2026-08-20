class Solution {
    public String solution(String my_string, int s, int e) {
        
        StringBuilder target = new StringBuilder(my_string.substring(s, e + 1));
        target.reverse();
        
        return my_string.substring(0, s) + target + my_string.substring(e + 1);
    }
}