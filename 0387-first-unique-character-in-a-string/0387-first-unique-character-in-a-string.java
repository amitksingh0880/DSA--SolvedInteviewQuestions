class Solution {
    public int firstUniqChar(String s) {
        int flag;
        for(int i = 0 ; i < s.length(); i++)
        {   
            flag =0;
            for(int j = 0; j < s.length(); j++)
            {
                if(s.charAt(i) == s.charAt(j))
                {
                    flag++;
                    if(flag == 2){
                        break;
                    }
                }
            }
            if(flag == 1){
                return i;
            }
        }
        return -1;
    }
}