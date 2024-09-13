class Solution {
    public String longestCommonPrefix(String[] strs) {
      if(strs.length == 0)
        return "";
    StringBuilder sb = new StringBuilder();
    // for(int i = 0 ; i < strs[0].length(); i++)
    // {
    //     for(int j = 1 ; j < strs.length; j++)
    //     {
    //         if(i== strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i))
    //            {
    //              return strs[0].substring(0, i);
    //            }
    //     }
    // }
    //  return strs[0];
    Arrays.sort(strs);
    String first = strs[0];
    String last = strs[strs.length-1];
    for(int i = 0 ; i < Math.min(first.length() , last.length()); i++)
    {
        if(first.charAt(i) != last.charAt(i))
        {
            return sb.toString();
        }
        sb.append(first.charAt(i));
    }
    return sb.toString();
  }
}