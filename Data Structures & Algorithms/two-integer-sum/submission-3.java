class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashSet Approac
        // target - value : remainder; reminder in the set? 
        Map<Integer, Integer> set = new HashMap<>();
        for(int i =0; i < nums.length; i++){
            int reminder = target - nums[i];
            if(set.get(reminder) != null){
                return new int[] { set.get(reminder), i};
            }
            set.put(nums[i], i);
        }
        // return empty array as default
        return new int[] {};
    }
}
