class Solution {
    public int[] sortArray(int[] nums) {
         mergeSort(nums, 0 , nums.length-1);
         return nums;
    }
    private void mergeSort(int[] nums, int left , int right)
    {
           if(left >= right) return;

           int mid = (left + right )/2;

           mergeSort(nums,left, mid);
           mergeSort(nums,mid+1,right);

           merge(nums,left,mid,right);
    }
    private void merge(int[] nums, int left , int mid , int right)
    {
        int start = mid - left +1;
        int end = right - mid;

        int[] leftArray = new int[start];
        int[] rightArray = new int[end];

        for(int i = 0 ; i < start ; i++)
            leftArray[i] = nums[left + i];
        for (int i = 0; i < end; i++)
            rightArray[i] = nums[mid + 1 + i];

        int i = 0, j = 0, k = left;

        while (i < start && j < end) {
            if (leftArray[i] <= rightArray[j]) {
                nums[k++] = leftArray[i++];
            } else {
                nums[k++] = rightArray[j++];
            }
        }

        while (i < start) {
            nums[k++] = leftArray[i++];
        }

        while (j < end) {
            nums[k++] = rightArray[j++];
        }
    }
}