class Solution {
    public int[] twoSum(int[] nums, int target) {
          
        for(int i=0;i<nums.length;i++)
        {
            for(int j= 0 ;j<nums.length;j++)
            {
                // int sum=0;
                // sum=;
                if(nums[i]+nums[j]==target && i != j)
                {
                 return new int[]{i,j};
                }
            }
        } 
     return new int[]{0,0};
    }    
    //     HashMap<Integer,Integer> Map = new HashMap<>();
    //        int A,B;
    //     for(int i = 0 ; i < nums.length ; i++)
    //     {
    //            if(Map.containsKey(target - nums[i]))
    //            {
    //               A = i;
    //               B = Map.get(target - nums[i]);
    //               return new int[]{A,B};
    //            }
    //            else{
    //                Map.put(nums[i] , i);
    //            }
    //     }
         
    //   return null;
    //    HashMap<Integer,Integer> map = new HashMap<>();
    //     int sIndex;
    //     int eIndex;
    //    for(int i = 0 ; i < nums.length ; i++){
    //         if(map.containsKey(target - nums[i])){
    //             sIndex = i;
    //             eIndex = map.get(target - nums[i]);
    //             return new int[]{sIndex, eIndex};
    //         }else{
    //             map.put(nums[i],i);
    //         }
    //    }
    //  return new int[]{0,0};
    // }
}