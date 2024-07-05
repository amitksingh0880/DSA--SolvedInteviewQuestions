class Solution {
    public int firstUniqChar(String s) {
        // int flag;
        // for(int i = 0 ; i < s.length(); i++)
        // {   
        //     flag =0;
        //     for(int j = 0; j < s.length(); j++)
        //     {
        //         if(s.charAt(i) == s.charAt(j))
        //         {
        //             flag++;
        //             if(flag == 2){
        //                 break;
        //             }
        //         }
        //     }
        //     if(flag == 1){
        //         return i;
        //     }
        // }
        int[] freq = new int[26];
        for(int i=0 ; i <s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i = 0 ; i<s.length(); i++)
        {
            if(freq[s.charAt(i)-'a']==1)
             return i;
        }
        return -1;
    }
}