class Solution {
    public List<Integer> majorityElement(int[] nums) {
          
          int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        ArrayList<Integer> ele = new ArrayList<>();

        for(int i = 0 ; i < n ; i++)
        {
            int num = nums[i];
            map.put( num , map.getOrDefault(num , 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
        {
            if(entry.getValue() > n/3)
             {
                 ele.add(entry.getKey());
             }
        // for(int num : map.values()){
        //     if(num > n/3){
        //         ele.add(containsKey(num));
        //     }
             
        }
     return ele;
    }
}