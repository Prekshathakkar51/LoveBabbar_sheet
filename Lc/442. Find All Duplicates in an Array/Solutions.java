class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        int n = nums.length;
        ArrayList<Integer> list=new ArrayList<Integer>();

        Arrays.sort(nums);

        for(int i = 0; i<n-1; i++){
            if(nums[i] == nums[i+1]){
                list.add(nums[i]);
                i++;

            }
        }

        return list;
        
    }
}