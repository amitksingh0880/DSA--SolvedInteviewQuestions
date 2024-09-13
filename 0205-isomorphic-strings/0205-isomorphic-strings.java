class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
           return false;
        HashMap<Character,Character> maps = new HashMap<>();
        HashMap<Character,Character> mapt = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++)
        {
            char chS = s.charAt(i);
            char chT = t.charAt(i);
            if(maps.containsKey(chS))
            {
               if(maps.get(chS) != chT)
                {
                    return false;
                }
            }else{
                if(mapt.containsKey(chT))
                {
                    return false;
                }
                maps.put(chS, chT);
                mapt.put(chT, chS);
            }
        }
        return true;
    }
}