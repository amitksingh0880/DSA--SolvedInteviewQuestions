class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int[] arr = new int[nums.length];
        int k = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] != val)
            {
                arr[k] = nums[i];
                count++;
                k++;
            }
        }
        for(int i = 0 ; i < nums.length ; i++)
        {
            nums[i] = arr[i];
        }
        return count;
    }
}