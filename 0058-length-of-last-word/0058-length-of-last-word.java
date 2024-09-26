class Solution {
    public int lengthOfLastWord(String s) {
        // int length =0;
        // String str = s.strip();
        String[] st = s.split(" ");
        
         return st[st.length -1].length();
    //  return length;
    }
}