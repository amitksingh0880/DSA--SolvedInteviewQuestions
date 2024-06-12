class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character,Integer> map = new HashMap<>();
           for(int i = 0 ; i < s.length() ; i++)
            {
                    map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
            }

         for(int i = 0 ; i < t.length() ; i++)
            {    
                char ch = t.charAt(i);
                if(map.containsKey(ch)==false)
                {
                    return false;
                }
                   map.put(ch, map.get(ch) - 1);
            }
        
        for(int c : map.values())
        {
            if(c!=0)
            {
                return false;
            }
        }
      return true;  

    //     char[] arr1 = s.toCharArray();
    //     char[] arr2 = t.toCharArray();

    //     Arrays.sort(arr1);
    //     Arrays.sort(arr2);

    //     if(Arrays.equals(arr1 , arr2))
    //     {
    //          return true;
    //     }
    //    return false;
    }
}