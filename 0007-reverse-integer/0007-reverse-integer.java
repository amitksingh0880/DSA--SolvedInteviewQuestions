class Solution {
    public int reverse(int x) {
        int N=x;
        int reverse = 0;
    while(N!=0)
    {    
       if(reverse < (Integer.MIN_VALUE/10) || reverse > (Integer.MAX_VALUE/10))
       {
          return 0;
       }
        int digit = N%10;
        reverse = reverse*10+digit;
        N = N/10;
    }
  return reverse;
    }
}