class Solution {
    public int[] twoSum(int[] nums, int target) {
          
        // for(int i=0;i<nums.length-1;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         int sum=0;
        //         sum=nums[i]+nums[j];
        //         if(sum==target)
        //         {
        //          return new int[]{i,j};
        //         }
        //     }
        // } 
        
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
       HashMap<Integer,Integer> map = new HashMap<>();
        int sIndex;
        int eIndex;
       for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(target - nums[i])){
                sIndex = i;
                eIndex = map.get(target - nums[i]);
                return new int[]{sIndex, eIndex};
            }else{
                map.put(nums[i],i);
            }
       }
     return new int[]{0,0};
    }
}