class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 1. Hashmap approach
        Map<Integer, Integer> records = new HashMap<>();

        for(int i = 0; i< nums.length; i++){
            int left = target - nums[i];
            if(records.get(left) != null)
            {
                return new int[]{records.get(left), i};
            }
            records.put(nums[i], i);
        }
        // return new int[]{};
        return null;
    }
}
