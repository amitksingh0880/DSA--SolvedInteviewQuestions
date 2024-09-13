class Solution {
    public boolean rotateString(String s, String goal) {
        if(s ==null || goal == null)
           return false;
        if(s.length() != goal.length())
            return false;
        if(s.length() == 0)
            return true;
        for(int i = 0 ; i < s.length(); i++)
        {
            if(rotateString(s,goal,i))
                return true;
        }
        return false;
    }
    private boolean rotateString(String a, String b, int rotation)
    {
        for(int i = 0 ; i < a.length(); i++)
        {
            if(a.charAt(i) != b.charAt((i+ rotation)%b.length()))
               return false;
        }
        return true;
    }
}