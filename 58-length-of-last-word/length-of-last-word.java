class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int len = s.length();
        int count = 0;
        int i = len-1;
        while(i>=0 && ' ' != s.charAt(i)){
            count++;
            i--;
        }
        return count;
    }
}