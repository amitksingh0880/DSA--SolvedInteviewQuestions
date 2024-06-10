class Solution {
    public boolean isPalindrome(int x) {
         int X=x;
         int Y = 0;
      while (X > 0) {
         int digit = X % 10;
         Y = Y * 10 + digit;
         X = X / 10;
       }
      if(Y==x)
      {
          return true;
      }
      else{
          return false;
      }
    }
}