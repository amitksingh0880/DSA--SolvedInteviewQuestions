class Solution {
    public boolean isPalindrome(String s) {
        
    //    String str = s;
    //    String s = null;
       int low = 0;
       int high = s.length()-1;

       while(low <= high)
       {   
          char l = s.charAt(low), r = s.charAt(high);
          if(Character.isLetterOrDigit(l)!= true)
          {
            low++;
          }
          else if(Character.isLetterOrDigit(r)!= true)
          {
            high--;
          }
          else
          {
            if(Character.toLowerCase(l)!= Character.toLowerCase(r))
            {
                  return false;
            }
              low++;
              high--;     
           }

       }
       return true;
    }
}