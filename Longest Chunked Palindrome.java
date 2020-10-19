class Solution {
    public int longestDecomposition(String text) {
        String left = "";
        String right = "";
        int len = text.length();
        int count = 0;
        for (int i=0; i < len ; i++) {
            left = left + text.charAt(i);
            right = text.charAt(len-1-i) + right;
            
            if (left.equals(right)) {
                count++;
                left = "";
                right = "";
            }
        }
        
        return count;
    }
}