
class Solution {
    public int majorityElement(int[] nums) {
        // int count = int(nums.length/2);
        
        Arrays.sort(nums);
        return nums[nums.length/2];
        
        
    }
}
