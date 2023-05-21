class Solution {
    public int findPeakElement(int[] nums) {

         int start = 0;
        int end = nums.length -1;

        while(start<end){
            int mid = start + (end - start)/2;

            if(nums[mid] > nums[mid+1]){
                // descending part of  arr
                end = mid;
            }
            else{
                // ascending part
                start = mid+1;
            }

        }

        return start; // or yoy can also return end
        
    }
}